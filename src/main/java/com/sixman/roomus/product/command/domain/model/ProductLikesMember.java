package com.sixman.roomus.product.command.domain.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "TBL_PRODUCT_LIKES_MEMBER")
public class ProductLikesMember {

    @EmbeddedId
    private ProductLikesMemberPK productLikesMemberPk;

}