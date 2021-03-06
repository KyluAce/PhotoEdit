package com.example.kylu.photoedit.View;
//cc
import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;

import com.example.kylu.photoedit.R;
import com.example.kylu.photoedit.Model.Photography;

import java.io.IOException;

public class ChoiceActivity extends Activity {

    private ImageView takePicture;
    private ImageView getGallery;

    private static Photography photo =  Photography.getInstance();

    private int TAKE_PICTURE = 1;
    private int FROM_GALLERY = 2;

    protected void onResume(){
        super.onResume();

    }


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);
        getActionBar().hide();


        takePicture = (ImageView)findViewById(R.id.imageCameraChoice);

       takePicture.setOnClickListener(new View.OnClickListener()
       {
           public void onClick(View arg0) {
               Intent cameraIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
               startActivityForResult(cameraIntent, TAKE_PICTURE);
           }
       });

        getGallery = (ImageView)findViewById(R.id.imageGalleryChoice);
        getGallery.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View arg0) {
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(Intent.createChooser(intent,"Select Picture"), FROM_GALLERY);
            }
        });
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == RESULT_OK) {
            if (requestCode == FROM_GALLERY) {
                Uri selectedImageUri = data.getData();
                Photography.getInstance().setPath(getPath(selectedImageUri));
                try {
                    Bitmap bitmap = MediaStore.Images.Media.getBitmap(this.getContentResolver(), selectedImageUri);
                    Photography.getInstance().setPhoto(bitmap);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (requestCode == TAKE_PICTURE) {


                Bitmap photo2 = (Bitmap)data.getExtras().get("data");
                Photography.getInstance().setPhoto(photo2);
            }

            //Funkcje.przywrocona=Funkcje.oryginal;
            Intent PictureEdit = new Intent(getApplicationContext(), PictureEdit.class);
            startActivity(PictureEdit);
        }
    }


    public String getPath(Uri uri) {
        String[] projection = { MediaStore.Images.Media.DATA };
        Cursor cursor = managedQuery(uri, projection, null, null, null);
        int column_index = cursor.getColumnIndexOrThrow(MediaStore.Images.Media.DATA);
        cursor.moveToFirst();
        return cursor.getString(column_index);
    }



}
