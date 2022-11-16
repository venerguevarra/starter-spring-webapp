package com.bootcamp.web.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@Table(name = "USER_ACCOUNTS")
public class UserAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "custom_user_account_sequence")
    @SequenceGenerator(sequenceName = "custom_user_account_sequence", name = "custom_user_account_sequence", allocationSize = 1)
    private Long id;

    @Column(columnDefinition = "VARCHAR(15)", nullable = false)
    private String password;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

}
