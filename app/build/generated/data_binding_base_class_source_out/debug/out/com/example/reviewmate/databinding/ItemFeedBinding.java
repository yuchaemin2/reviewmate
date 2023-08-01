// Generated by view binder compiler. Do not edit!
package com.example.reviewmate.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.reviewmate.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemFeedBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView itemContentView;

  @NonNull
  public final TextView itemDateView;

  @NonNull
  public final TextView itemEmailView;

  @NonNull
  public final ImageView itemImageView;

  @NonNull
  public final ImageView itemImg;

  @NonNull
  public final TextView itemMovieView;

  @NonNull
  public final TextView itemRateView;

  @NonNull
  public final TextView itemTitleView;

  private ItemFeedBinding(@NonNull LinearLayout rootView, @NonNull TextView itemContentView,
      @NonNull TextView itemDateView, @NonNull TextView itemEmailView,
      @NonNull ImageView itemImageView, @NonNull ImageView itemImg, @NonNull TextView itemMovieView,
      @NonNull TextView itemRateView, @NonNull TextView itemTitleView) {
    this.rootView = rootView;
    this.itemContentView = itemContentView;
    this.itemDateView = itemDateView;
    this.itemEmailView = itemEmailView;
    this.itemImageView = itemImageView;
    this.itemImg = itemImg;
    this.itemMovieView = itemMovieView;
    this.itemRateView = itemRateView;
    this.itemTitleView = itemTitleView;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemFeedBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemFeedBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_feed, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemFeedBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.itemContentView;
      TextView itemContentView = ViewBindings.findChildViewById(rootView, id);
      if (itemContentView == null) {
        break missingId;
      }

      id = R.id.itemDateView;
      TextView itemDateView = ViewBindings.findChildViewById(rootView, id);
      if (itemDateView == null) {
        break missingId;
      }

      id = R.id.itemEmailView;
      TextView itemEmailView = ViewBindings.findChildViewById(rootView, id);
      if (itemEmailView == null) {
        break missingId;
      }

      id = R.id.itemImageView;
      ImageView itemImageView = ViewBindings.findChildViewById(rootView, id);
      if (itemImageView == null) {
        break missingId;
      }

      id = R.id.item_img;
      ImageView itemImg = ViewBindings.findChildViewById(rootView, id);
      if (itemImg == null) {
        break missingId;
      }

      id = R.id.itemMovieView;
      TextView itemMovieView = ViewBindings.findChildViewById(rootView, id);
      if (itemMovieView == null) {
        break missingId;
      }

      id = R.id.itemRateView;
      TextView itemRateView = ViewBindings.findChildViewById(rootView, id);
      if (itemRateView == null) {
        break missingId;
      }

      id = R.id.itemTitleView;
      TextView itemTitleView = ViewBindings.findChildViewById(rootView, id);
      if (itemTitleView == null) {
        break missingId;
      }

      return new ItemFeedBinding((LinearLayout) rootView, itemContentView, itemDateView,
          itemEmailView, itemImageView, itemImg, itemMovieView, itemRateView, itemTitleView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
