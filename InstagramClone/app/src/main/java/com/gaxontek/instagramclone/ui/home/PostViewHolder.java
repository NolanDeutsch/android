package com.gaxontek.instagramclone.ui.home;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.gaxontek.instagramclone.R;

public class PostViewHolder extends RecyclerView.ViewHolder {

    public LinearLayout root;
    public TextView txtPostUsername, txtLikeNumber, txtPostDescription;
    public ImageButton btnHeart, btnComment;

    public PostViewHolder(@NonNull View itemView) {
        super(itemView);

        root = itemView.findViewById(R.id.layout_post_root);
        txtPostUsername = itemView.findViewById(R.id.text_post_username);
        txtLikeNumber = itemView.findViewById(R.id.text_number_liked);
        txtPostDescription = itemView.findViewById(R.id.text_post_username_comment);
        btnHeart = itemView.findViewById(R.id.btn_heart);
        btnComment = itemView.findViewById(R.id.btn_comment);
    }

    public void setTxtName(String string) {
        txtPostUsername.setText(string);
    }
    public void setLikeNumber(int num) { txtLikeNumber.setText(String.valueOf(num)); }
    public void setTxtPostDescription(String string) { txtPostDescription.setText(string); }


}
