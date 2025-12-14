package com.unaiz.usermanagement.entity;

import java.time.Instant;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.unaiz.usermanagement.enums.Gender;

import io.micrometer.common.lang.NonNull;
import jakarta.annotation.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "users_profile")
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserProfile {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;

  @OneToOne
  @JoinColumn(name = "user_id", nullable = false, unique = true)
  User user;

  @NonNull
  String firstName;

  @NonNull
  String lastName;

  @Nullable
  Instant dateOfBirth;

  @Column(nullable = false)
  @NotBlank
  String phoneNumber;

  @Enumerated(EnumType.STRING)
  Gender gender;

  @Nullable
  String ProfilePictureUrl;

  @Nullable
  String bio;

  @CreationTimestamp
  Instant createdAt;

  @UpdateTimestamp
  Instant updatedAt;

}
