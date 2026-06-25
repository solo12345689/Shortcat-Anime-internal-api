.class public final Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DefaultPaywallPreviewsKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0003\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u001a\u000f\u0010\u0003\u001a\u00020\u0000H\u0003\u00a2\u0006\u0004\u0008\u0003\u0010\u0002\u001a\u000f\u0010\u0004\u001a\u00020\u0000H\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0002\u001a\u000f\u0010\u0005\u001a\u00020\u0000H\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0002\u001a\u000f\u0010\u0006\u001a\u00020\u0000H\u0003\u00a2\u0006\u0004\u0008\u0006\u0010\u0002\u001a!\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0008\u001a\u00020\u00072\u0008\u0010\n\u001a\u0004\u0018\u00010\tH\u0003\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\"\u001a\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "LTd/L;",
        "DefaultPaywallRedGreenPreview",
        "(LY/m;I)V",
        "DefaultPaywallBlueGreenPreview",
        "DefaultPaywallPurpleOrangePreview",
        "DefaultPaywallWarningLocalizationPreview",
        "DefaultPaywallWarningNoPaywallPreview",
        "Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DualColorImageGenerator$PreviewAppIcon;",
        "icon",
        "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallWarning;",
        "warning",
        "DefaultPaywallPreview",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DualColorImageGenerator$PreviewAppIcon;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallWarning;LY/m;I)V",
        "",
        "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;",
        "previewPackages",
        "Ljava/util/List;",
        "revenuecatui_defaultsBc8Release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final previewPackages:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 19

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData$Packages;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData$Packages;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData$Packages;->getAnnual()Lcom/revenuecat/purchases/Package;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData$Packages;->getMonthly()Lcom/revenuecat/purchases/Package;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    filled-new-array {v1, v0}, [Lcom/revenuecat/purchases/Package;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, LUd/u;->p([Ljava/lang/Object;)Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    new-instance v1, Ljava/util/ArrayList;

    .line 20
    .line 21
    const/16 v2, 0xa

    .line 22
    .line 23
    invoke-static {v0, v2}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 28
    .line 29
    .line 30
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_0

    .line 39
    .line 40
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    check-cast v2, Lcom/revenuecat/purchases/Package;

    .line 45
    .line 46
    new-instance v3, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;

    .line 47
    .line 48
    new-instance v4, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/ProcessedLocalizedConfiguration;

    .line 49
    .line 50
    invoke-virtual {v2}, Lcom/revenuecat/purchases/Package;->getProduct()Lcom/revenuecat/purchases/models/StoreProduct;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    invoke-interface {v5}, Lcom/revenuecat/purchases/models/StoreProduct;->getName()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    invoke-virtual {v2}, Lcom/revenuecat/purchases/Package;->getProduct()Lcom/revenuecat/purchases/models/StoreProduct;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    invoke-interface {v6}, Lcom/revenuecat/purchases/models/StoreProduct;->getName()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v13

    .line 66
    const/16 v17, 0x400

    .line 67
    .line 68
    const/16 v18, 0x0

    .line 69
    .line 70
    const/4 v6, 0x0

    .line 71
    const-string v7, "Continue"

    .line 72
    .line 73
    const/4 v8, 0x0

    .line 74
    const/4 v9, 0x0

    .line 75
    const/4 v10, 0x0

    .line 76
    const/4 v11, 0x0

    .line 77
    const/4 v12, 0x0

    .line 78
    const/4 v14, 0x0

    .line 79
    const/4 v15, 0x0

    .line 80
    const/16 v16, 0x0

    .line 81
    .line 82
    invoke-direct/range {v4 .. v18}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/ProcessedLocalizedConfiguration;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 83
    .line 84
    .line 85
    const/4 v5, 0x0

    .line 86
    invoke-direct {v3, v2, v4, v5}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;-><init>(Lcom/revenuecat/purchases/Package;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/ProcessedLocalizedConfiguration;Ljava/lang/Double;)V

    .line 87
    .line 88
    .line 89
    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_0
    sput-object v1, Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DefaultPaywallPreviewsKt;->previewPackages:Ljava/util/List;

    .line 94
    .line 95
    return-void
.end method

.method private static final DefaultPaywallBlueGreenPreview(LY/m;I)V
    .locals 3

    .line 1
    const v0, 0x2732f7ec

    .line 2
    .line 3
    .line 4
    invoke-interface {p0, v0}, LY/m;->g(I)LY/m;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    if-nez p1, :cond_1

    .line 9
    .line 10
    invoke-interface {p0}, LY/m;->i()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-interface {p0}, LY/m;->K()V

    .line 18
    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    :goto_0
    invoke-static {}, LY/w;->L()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    const/4 v1, -0x1

    .line 28
    const-string v2, "com.revenuecat.purchases.ui.revenuecatui.defaultpaywall.DefaultPaywallBlueGreenPreview (DefaultPaywallPreviews.kt:61)"

    .line 29
    .line 30
    invoke-static {v0, p1, v1, v2}, LY/w;->U(IIILjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :cond_2
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DualColorImageGenerator;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DualColorImageGenerator;

    .line 34
    .line 35
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DualColorImageGenerator;->getBlueGreen()Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DualColorImageGenerator$PreviewAppIcon;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    const/4 v1, 0x0

    .line 40
    const/16 v2, 0x30

    .line 41
    .line 42
    invoke-static {v0, v1, p0, v2}, Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DefaultPaywallPreviewsKt;->DefaultPaywallPreview(Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DualColorImageGenerator$PreviewAppIcon;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallWarning;LY/m;I)V

    .line 43
    .line 44
    .line 45
    invoke-static {}, LY/w;->L()Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_3

    .line 50
    .line 51
    invoke-static {}, LY/w;->T()V

    .line 52
    .line 53
    .line 54
    :cond_3
    :goto_1
    invoke-interface {p0}, LY/m;->k()LY/B1;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    if-eqz p0, :cond_4

    .line 59
    .line 60
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DefaultPaywallPreviewsKt$DefaultPaywallBlueGreenPreview$1;

    .line 61
    .line 62
    invoke-direct {v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DefaultPaywallPreviewsKt$DefaultPaywallBlueGreenPreview$1;-><init>(I)V

    .line 63
    .line 64
    .line 65
    invoke-interface {p0, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 66
    .line 67
    .line 68
    :cond_4
    return-void
.end method

.method private static final DefaultPaywallPreview(Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DualColorImageGenerator$PreviewAppIcon;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallWarning;LY/m;I)V
    .locals 84

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    const v3, 0x73fe7927

    .line 8
    .line 9
    .line 10
    move-object/from16 v4, p2

    .line 11
    .line 12
    invoke-interface {v4, v3}, LY/m;->g(I)LY/m;

    .line 13
    .line 14
    .line 15
    move-result-object v8

    .line 16
    and-int/lit8 v4, v2, 0x6

    .line 17
    .line 18
    if-nez v4, :cond_1

    .line 19
    .line 20
    invoke-interface {v8, v0}, LY/m;->F(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    if-eqz v4, :cond_0

    .line 25
    .line 26
    const/4 v4, 0x4

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v4, 0x2

    .line 29
    :goto_0
    or-int/2addr v4, v2

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    move v4, v2

    .line 32
    :goto_1
    and-int/lit8 v5, v2, 0x30

    .line 33
    .line 34
    if-nez v5, :cond_3

    .line 35
    .line 36
    invoke-interface {v8, v1}, LY/m;->U(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    if-eqz v5, :cond_2

    .line 41
    .line 42
    const/16 v5, 0x20

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_2
    const/16 v5, 0x10

    .line 46
    .line 47
    :goto_2
    or-int/2addr v4, v5

    .line 48
    :cond_3
    and-int/lit8 v5, v4, 0x13

    .line 49
    .line 50
    const/16 v6, 0x12

    .line 51
    .line 52
    if-ne v5, v6, :cond_5

    .line 53
    .line 54
    invoke-interface {v8}, LY/m;->i()Z

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    if-nez v5, :cond_4

    .line 59
    .line 60
    goto :goto_3

    .line 61
    :cond_4
    invoke-interface {v8}, LY/m;->K()V

    .line 62
    .line 63
    .line 64
    goto/16 :goto_6

    .line 65
    .line 66
    :cond_5
    :goto_3
    invoke-static {}, LY/w;->L()Z

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    if-eqz v5, :cond_6

    .line 71
    .line 72
    const/4 v5, -0x1

    .line 73
    const-string v6, "com.revenuecat.purchases.ui.revenuecatui.defaultpaywall.DefaultPaywallPreview (DefaultPaywallPreviews.kt:114)"

    .line 74
    .line 75
    invoke-static {v3, v4, v5, v6}, LY/w;->U(IIILjava/lang/String;)V

    .line 76
    .line 77
    .line 78
    :cond_6
    const/4 v3, 0x0

    .line 79
    invoke-static {v8, v3}, Lx/m;->a(LY/m;I)Z

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    const/16 v82, 0xf

    .line 84
    .line 85
    const/16 v83, 0x0

    .line 86
    .line 87
    const-wide/16 v9, 0x0

    .line 88
    .line 89
    const-wide/16 v11, 0x0

    .line 90
    .line 91
    const-wide/16 v13, 0x0

    .line 92
    .line 93
    const-wide/16 v15, 0x0

    .line 94
    .line 95
    const-wide/16 v17, 0x0

    .line 96
    .line 97
    const-wide/16 v19, 0x0

    .line 98
    .line 99
    const-wide/16 v21, 0x0

    .line 100
    .line 101
    const-wide/16 v23, 0x0

    .line 102
    .line 103
    const-wide/16 v25, 0x0

    .line 104
    .line 105
    const-wide/16 v27, 0x0

    .line 106
    .line 107
    const-wide/16 v29, 0x0

    .line 108
    .line 109
    const-wide/16 v31, 0x0

    .line 110
    .line 111
    const-wide/16 v33, 0x0

    .line 112
    .line 113
    const-wide/16 v35, 0x0

    .line 114
    .line 115
    const-wide/16 v37, 0x0

    .line 116
    .line 117
    const-wide/16 v39, 0x0

    .line 118
    .line 119
    const-wide/16 v41, 0x0

    .line 120
    .line 121
    const-wide/16 v43, 0x0

    .line 122
    .line 123
    const-wide/16 v45, 0x0

    .line 124
    .line 125
    const-wide/16 v47, 0x0

    .line 126
    .line 127
    const-wide/16 v49, 0x0

    .line 128
    .line 129
    const-wide/16 v51, 0x0

    .line 130
    .line 131
    const-wide/16 v53, 0x0

    .line 132
    .line 133
    const-wide/16 v55, 0x0

    .line 134
    .line 135
    const-wide/16 v57, 0x0

    .line 136
    .line 137
    const-wide/16 v59, 0x0

    .line 138
    .line 139
    const-wide/16 v61, 0x0

    .line 140
    .line 141
    const-wide/16 v63, 0x0

    .line 142
    .line 143
    const-wide/16 v65, 0x0

    .line 144
    .line 145
    const-wide/16 v67, 0x0

    .line 146
    .line 147
    const-wide/16 v69, 0x0

    .line 148
    .line 149
    const-wide/16 v71, 0x0

    .line 150
    .line 151
    const-wide/16 v73, 0x0

    .line 152
    .line 153
    const-wide/16 v75, 0x0

    .line 154
    .line 155
    const-wide/16 v77, 0x0

    .line 156
    .line 157
    const-wide/16 v79, 0x0

    .line 158
    .line 159
    const/16 v81, -0x1

    .line 160
    .line 161
    if-eqz v3, :cond_7

    .line 162
    .line 163
    invoke-static/range {v9 .. v83}, LU/m;->e(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJIILjava/lang/Object;)LU/l;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    :goto_4
    move-object v4, v3

    .line 168
    goto :goto_5

    .line 169
    :cond_7
    invoke-static/range {v9 .. v83}, LU/m;->j(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJIILjava/lang/Object;)LU/l;

    .line 170
    .line 171
    .line 172
    move-result-object v3

    .line 173
    goto :goto_4

    .line 174
    :goto_5
    new-instance v3, Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DefaultPaywallPreviewsKt$DefaultPaywallPreview$1;

    .line 175
    .line 176
    invoke-direct {v3, v1, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DefaultPaywallPreviewsKt$DefaultPaywallPreview$1;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallWarning;Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DualColorImageGenerator$PreviewAppIcon;)V

    .line 177
    .line 178
    .line 179
    const/16 v5, 0x36

    .line 180
    .line 181
    const v6, 0x787462fb    # 1.9827E34f

    .line 182
    .line 183
    .line 184
    const/4 v7, 0x1

    .line 185
    invoke-static {v6, v7, v3, v8, v5}, Lg0/i;->d(IZLjava/lang/Object;LY/m;I)Lg0/b;

    .line 186
    .line 187
    .line 188
    move-result-object v7

    .line 189
    const/16 v9, 0xc00

    .line 190
    .line 191
    const/4 v10, 0x6

    .line 192
    const/4 v5, 0x0

    .line 193
    const/4 v6, 0x0

    .line 194
    invoke-static/range {v4 .. v10}, LU/E;->a(LU/l;LU/U;LU/o0;Lkotlin/jvm/functions/Function2;LY/m;II)V

    .line 195
    .line 196
    .line 197
    invoke-static {}, LY/w;->L()Z

    .line 198
    .line 199
    .line 200
    move-result v3

    .line 201
    if-eqz v3, :cond_8

    .line 202
    .line 203
    invoke-static {}, LY/w;->T()V

    .line 204
    .line 205
    .line 206
    :cond_8
    :goto_6
    invoke-interface {v8}, LY/m;->k()LY/B1;

    .line 207
    .line 208
    .line 209
    move-result-object v3

    .line 210
    if-eqz v3, :cond_9

    .line 211
    .line 212
    new-instance v4, Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DefaultPaywallPreviewsKt$DefaultPaywallPreview$2;

    .line 213
    .line 214
    invoke-direct {v4, v0, v1, v2}, Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DefaultPaywallPreviewsKt$DefaultPaywallPreview$2;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DualColorImageGenerator$PreviewAppIcon;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallWarning;I)V

    .line 215
    .line 216
    .line 217
    invoke-interface {v3, v4}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 218
    .line 219
    .line 220
    :cond_9
    return-void
.end method

.method private static final DefaultPaywallPurpleOrangePreview(LY/m;I)V
    .locals 3

    .line 1
    const v0, 0x158d4c4b

    .line 2
    .line 3
    .line 4
    invoke-interface {p0, v0}, LY/m;->g(I)LY/m;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    if-nez p1, :cond_1

    .line 9
    .line 10
    invoke-interface {p0}, LY/m;->i()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-interface {p0}, LY/m;->K()V

    .line 18
    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    :goto_0
    invoke-static {}, LY/w;->L()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    const/4 v1, -0x1

    .line 28
    const-string v2, "com.revenuecat.purchases.ui.revenuecatui.defaultpaywall.DefaultPaywallPurpleOrangePreview (DefaultPaywallPreviews.kt:75)"

    .line 29
    .line 30
    invoke-static {v0, p1, v1, v2}, LY/w;->U(IIILjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :cond_2
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DualColorImageGenerator;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DualColorImageGenerator;

    .line 34
    .line 35
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DualColorImageGenerator;->getPurpleOrange()Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DualColorImageGenerator$PreviewAppIcon;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    const/4 v1, 0x0

    .line 40
    const/16 v2, 0x30

    .line 41
    .line 42
    invoke-static {v0, v1, p0, v2}, Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DefaultPaywallPreviewsKt;->DefaultPaywallPreview(Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DualColorImageGenerator$PreviewAppIcon;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallWarning;LY/m;I)V

    .line 43
    .line 44
    .line 45
    invoke-static {}, LY/w;->L()Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_3

    .line 50
    .line 51
    invoke-static {}, LY/w;->T()V

    .line 52
    .line 53
    .line 54
    :cond_3
    :goto_1
    invoke-interface {p0}, LY/m;->k()LY/B1;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    if-eqz p0, :cond_4

    .line 59
    .line 60
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DefaultPaywallPreviewsKt$DefaultPaywallPurpleOrangePreview$1;

    .line 61
    .line 62
    invoke-direct {v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DefaultPaywallPreviewsKt$DefaultPaywallPurpleOrangePreview$1;-><init>(I)V

    .line 63
    .line 64
    .line 65
    invoke-interface {p0, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 66
    .line 67
    .line 68
    :cond_4
    return-void
.end method

.method private static final DefaultPaywallRedGreenPreview(LY/m;I)V
    .locals 3

    .line 1
    const v0, -0x328fc84d

    .line 2
    .line 3
    .line 4
    invoke-interface {p0, v0}, LY/m;->g(I)LY/m;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    if-nez p1, :cond_1

    .line 9
    .line 10
    invoke-interface {p0}, LY/m;->i()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-interface {p0}, LY/m;->K()V

    .line 18
    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    :goto_0
    invoke-static {}, LY/w;->L()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    const/4 v1, -0x1

    .line 28
    const-string v2, "com.revenuecat.purchases.ui.revenuecatui.defaultpaywall.DefaultPaywallRedGreenPreview (DefaultPaywallPreviews.kt:47)"

    .line 29
    .line 30
    invoke-static {v0, p1, v1, v2}, LY/w;->U(IIILjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :cond_2
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DualColorImageGenerator;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DualColorImageGenerator;

    .line 34
    .line 35
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DualColorImageGenerator;->getRedGreen()Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DualColorImageGenerator$PreviewAppIcon;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    const/4 v1, 0x0

    .line 40
    const/16 v2, 0x30

    .line 41
    .line 42
    invoke-static {v0, v1, p0, v2}, Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DefaultPaywallPreviewsKt;->DefaultPaywallPreview(Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DualColorImageGenerator$PreviewAppIcon;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallWarning;LY/m;I)V

    .line 43
    .line 44
    .line 45
    invoke-static {}, LY/w;->L()Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_3

    .line 50
    .line 51
    invoke-static {}, LY/w;->T()V

    .line 52
    .line 53
    .line 54
    :cond_3
    :goto_1
    invoke-interface {p0}, LY/m;->k()LY/B1;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    if-eqz p0, :cond_4

    .line 59
    .line 60
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DefaultPaywallPreviewsKt$DefaultPaywallRedGreenPreview$1;

    .line 61
    .line 62
    invoke-direct {v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DefaultPaywallPreviewsKt$DefaultPaywallRedGreenPreview$1;-><init>(I)V

    .line 63
    .line 64
    .line 65
    invoke-interface {p0, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 66
    .line 67
    .line 68
    :cond_4
    return-void
.end method

.method private static final DefaultPaywallWarningLocalizationPreview(LY/m;I)V
    .locals 3

    .line 1
    const v0, -0xbc88fc8

    .line 2
    .line 3
    .line 4
    invoke-interface {p0, v0}, LY/m;->g(I)LY/m;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    if-nez p1, :cond_1

    .line 9
    .line 10
    invoke-interface {p0}, LY/m;->i()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-interface {p0}, LY/m;->K()V

    .line 18
    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    :goto_0
    invoke-static {}, LY/w;->L()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    const/4 v1, -0x1

    .line 28
    const-string v2, "com.revenuecat.purchases.ui.revenuecatui.defaultpaywall.DefaultPaywallWarningLocalizationPreview (DefaultPaywallPreviews.kt:89)"

    .line 29
    .line 30
    invoke-static {v0, p1, v1, v2}, LY/w;->U(IIILjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :cond_2
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DualColorImageGenerator;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DualColorImageGenerator;

    .line 34
    .line 35
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DualColorImageGenerator;->getRedGreen()Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DualColorImageGenerator$PreviewAppIcon;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sget-object v1, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallWarning$MissingLocalization;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallWarning$MissingLocalization;

    .line 40
    .line 41
    const/16 v2, 0x30

    .line 42
    .line 43
    invoke-static {v0, v1, p0, v2}, Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DefaultPaywallPreviewsKt;->DefaultPaywallPreview(Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DualColorImageGenerator$PreviewAppIcon;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallWarning;LY/m;I)V

    .line 44
    .line 45
    .line 46
    invoke-static {}, LY/w;->L()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_3

    .line 51
    .line 52
    invoke-static {}, LY/w;->T()V

    .line 53
    .line 54
    .line 55
    :cond_3
    :goto_1
    invoke-interface {p0}, LY/m;->k()LY/B1;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    if-eqz p0, :cond_4

    .line 60
    .line 61
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DefaultPaywallPreviewsKt$DefaultPaywallWarningLocalizationPreview$1;

    .line 62
    .line 63
    invoke-direct {v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DefaultPaywallPreviewsKt$DefaultPaywallWarningLocalizationPreview$1;-><init>(I)V

    .line 64
    .line 65
    .line 66
    invoke-interface {p0, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 67
    .line 68
    .line 69
    :cond_4
    return-void
.end method

.method private static final DefaultPaywallWarningNoPaywallPreview(LY/m;I)V
    .locals 3

    .line 1
    const v0, -0x28c9fa0a

    .line 2
    .line 3
    .line 4
    invoke-interface {p0, v0}, LY/m;->g(I)LY/m;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    if-nez p1, :cond_1

    .line 9
    .line 10
    invoke-interface {p0}, LY/m;->i()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-interface {p0}, LY/m;->K()V

    .line 18
    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    :goto_0
    invoke-static {}, LY/w;->L()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    const/4 v1, -0x1

    .line 28
    const-string v2, "com.revenuecat.purchases.ui.revenuecatui.defaultpaywall.DefaultPaywallWarningNoPaywallPreview (DefaultPaywallPreviews.kt:103)"

    .line 29
    .line 30
    invoke-static {v0, p1, v1, v2}, LY/w;->U(IIILjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :cond_2
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DualColorImageGenerator;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DualColorImageGenerator;

    .line 34
    .line 35
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DualColorImageGenerator;->getPurpleOrange()Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DualColorImageGenerator$PreviewAppIcon;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    new-instance v1, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallWarning$NoPaywall;

    .line 40
    .line 41
    const-string v2, "WAT"

    .line 42
    .line 43
    invoke-direct {v1, v2}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallWarning$NoPaywall;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const/4 v2, 0x0

    .line 47
    invoke-static {v0, v1, p0, v2}, Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DefaultPaywallPreviewsKt;->DefaultPaywallPreview(Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DualColorImageGenerator$PreviewAppIcon;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallWarning;LY/m;I)V

    .line 48
    .line 49
    .line 50
    invoke-static {}, LY/w;->L()Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_3

    .line 55
    .line 56
    invoke-static {}, LY/w;->T()V

    .line 57
    .line 58
    .line 59
    :cond_3
    :goto_1
    invoke-interface {p0}, LY/m;->k()LY/B1;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    if-eqz p0, :cond_4

    .line 64
    .line 65
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DefaultPaywallPreviewsKt$DefaultPaywallWarningNoPaywallPreview$1;

    .line 66
    .line 67
    invoke-direct {v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DefaultPaywallPreviewsKt$DefaultPaywallWarningNoPaywallPreview$1;-><init>(I)V

    .line 68
    .line 69
    .line 70
    invoke-interface {p0, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 71
    .line 72
    .line 73
    :cond_4
    return-void
.end method

.method public static final synthetic access$DefaultPaywallBlueGreenPreview(LY/m;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DefaultPaywallPreviewsKt;->DefaultPaywallBlueGreenPreview(LY/m;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$DefaultPaywallPreview(Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DualColorImageGenerator$PreviewAppIcon;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallWarning;LY/m;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DefaultPaywallPreviewsKt;->DefaultPaywallPreview(Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DualColorImageGenerator$PreviewAppIcon;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallWarning;LY/m;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$DefaultPaywallPurpleOrangePreview(LY/m;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DefaultPaywallPreviewsKt;->DefaultPaywallPurpleOrangePreview(LY/m;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$DefaultPaywallRedGreenPreview(LY/m;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DefaultPaywallPreviewsKt;->DefaultPaywallRedGreenPreview(LY/m;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$DefaultPaywallWarningLocalizationPreview(LY/m;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DefaultPaywallPreviewsKt;->DefaultPaywallWarningLocalizationPreview(LY/m;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$DefaultPaywallWarningNoPaywallPreview(LY/m;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DefaultPaywallPreviewsKt;->DefaultPaywallWarningNoPaywallPreview(LY/m;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$getPreviewPackages$p()Ljava/util/List;
    .locals 1

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DefaultPaywallPreviewsKt;->previewPackages:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method
