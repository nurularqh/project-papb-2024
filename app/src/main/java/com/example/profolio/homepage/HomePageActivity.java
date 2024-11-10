package com.example.profolio.homepage;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.profolio.R;
import com.example.profolio.add.AddKepanitiaanActivity;
import com.example.profolio.add.AddOrganisasiActivity;
import com.example.profolio.add.AddPrestasiActivity;
import com.example.profolio.document.DocumentPageFragment;
import com.example.profolio.edit.EditProfileActivity;
import com.example.profolio.profile.ProfilePageFragment;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class HomePageActivity extends AppCompatActivity {
    TextView helloUser, slogan;
    LinearLayout containterRecyclerView;
    ShapeableImageView ivFotoProfile;
    ViewPager viewPager;
    TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page_1);

        containterRecyclerView = findViewById(R.id.containerRecyclerView);
        viewPager = findViewById(R.id.viewPager);
        helloUser = findViewById(R.id.helloUser);
        slogan = findViewById(R.id.slogan);
        ivFotoProfile = findViewById(R.id.iv_FotoProfile);
    }
}