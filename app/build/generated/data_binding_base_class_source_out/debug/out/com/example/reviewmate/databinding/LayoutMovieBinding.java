// Generated by view binder compiler. Do not edit!
package com.example.reviewmate.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.reviewmate.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class LayoutMovieBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final ImageView ivItem;

  @NonNull
  public final TextView tvItemContent;

  @NonNull
  public final TextView tvItemTitle;

  private LayoutMovieBinding(@NonNull FrameLayout rootView, @NonNull ImageView ivItem,
      @NonNull TextView tvItemContent, @NonNull TextView tvItemTitle) {
    this.rootView = rootView;
    this.ivItem = ivItem;
    this.tvItemContent = tvItemContent;
    this.tvItemTitle = tvItemTitle;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static LayoutMovieBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LayoutMovieBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.layout_movie, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LayoutMovieBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ivItem;
      ImageView ivItem = ViewBindings.findChildViewById(rootView, id);
      if (ivItem == null) {
        break missingId;
      }

      id = R.id.tvItemContent;
      TextView tvItemContent = ViewBindings.findChildViewById(rootView, id);
      if (tvItemContent == null) {
        break missingId;
      }

      id = R.id.tvItemTitle;
      TextView tvItemTitle = ViewBindings.findChildViewById(rootView, id);
      if (tvItemTitle == null) {
        break missingId;
      }

      return new LayoutMovieBinding((FrameLayout) rootView, ivItem, tvItemContent, tvItemTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
