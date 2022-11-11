package com.sixman.roomus.product.query.model;

import com.sixman.roomus.product.command.domain.model.ProductLikesMemberPK;
import lombok.*;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "TBL_PRODUCT_LIKES_MEMBER_DATA")
public class ProductLikesMemberData {

    @EmbeddedId
    private ProductLikesMemberDataPK productLikesMemberPk;

}