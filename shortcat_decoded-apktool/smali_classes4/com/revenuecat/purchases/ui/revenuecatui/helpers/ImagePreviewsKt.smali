.class public final Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ImagePreviewsKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a\u001d\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\u00002\u0006\u0010\u0008\u001a\u00020\u0007H\u0000\u00a2\u0006\u0004\u0008\n\u0010\u000b\"\"\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u000c8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lv4/d;",
        "imageLoader",
        "Lkotlin/Function0;",
        "LTd/L;",
        "content",
        "ProvidePreviewImageLoader",
        "(Lv4/d;Lkotlin/jvm/functions/Function2;LY/m;I)V",
        "LG4/h;",
        "imageRequest",
        "Lw0/b;",
        "getPreviewPlaceholderBlocking",
        "(Lv4/d;LG4/h;)Lw0/b;",
        "LY/b1;",
        "LocalPreviewImageLoader",
        "LY/b1;",
        "getLocalPreviewImageLoader",
        "()LY/b1;",
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
.field private static final synthetic LocalPreviewImageLoader:LY/b1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY/b1;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ImagePreviewsKt$LocalPreviewImageLoader$1;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ImagePreviewsKt$LocalPreviewImageLoader$1;

    .line 2
    .line 3
    invoke-static {v0}, LY/H;->j(Lie/a;)LY/b1;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ImagePreviewsKt;->LocalPreviewImageLoader:LY/b1;

    .line 8
    .line 9
    return-void
.end method

.method public static final synthetic ProvidePreviewImageLoader(Lv4/d;Lkotlin/jvm/functions/Function2;LY/m;I)V
    .locals 4

    .line 1
    const-string v0, "imageLoader"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "content"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const v0, -0x34e603a3    # -1.0091613E7f

    .line 12
    .line 13
    .line 14
    invoke-interface {p2, v0}, LY/m;->g(I)LY/m;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    and-int/lit8 v1, p3, 0x30

    .line 19
    .line 20
    const/16 v2, 0x10

    .line 21
    .line 22
    if-nez v1, :cond_1

    .line 23
    .line 24
    invoke-interface {p2, p1}, LY/m;->F(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    const/16 v1, 0x20

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move v1, v2

    .line 34
    :goto_0
    or-int/2addr v1, p3

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    move v1, p3

    .line 37
    :goto_1
    and-int/lit8 v3, v1, 0x11

    .line 38
    .line 39
    if-ne v3, v2, :cond_3

    .line 40
    .line 41
    invoke-interface {p2}, LY/m;->i()Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-nez v2, :cond_2

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_2
    invoke-interface {p2}, LY/m;->K()V

    .line 49
    .line 50
    .line 51
    goto :goto_3

    .line 52
    :cond_3
    :goto_2
    invoke-static {}, LY/w;->L()Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-eqz v2, :cond_4

    .line 57
    .line 58
    const/4 v2, -0x1

    .line 59
    const-string v3, "com.revenuecat.purchases.ui.revenuecatui.helpers.ProvidePreviewImageLoader (ImagePreviews.kt:21)"

    .line 60
    .line 61
    invoke-static {v0, v1, v2, v3}, LY/w;->U(IIILjava/lang/String;)V

    .line 62
    .line 63
    .line 64
    :cond_4
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ImagePreviewsKt;->LocalPreviewImageLoader:LY/b1;

    .line 65
    .line 66
    const/4 v2, 0x0

    .line 67
    invoke-virtual {v0, v2}, LY/b1;->d(Ljava/lang/Object;)LY/c1;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    sget v2, LY/c1;->i:I

    .line 72
    .line 73
    and-int/lit8 v1, v1, 0x70

    .line 74
    .line 75
    or-int/2addr v1, v2

    .line 76
    invoke-static {v0, p1, p2, v1}, LY/H;->c(LY/c1;Lkotlin/jvm/functions/Function2;LY/m;I)V

    .line 77
    .line 78
    .line 79
    invoke-static {}, LY/w;->L()Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-eqz v0, :cond_5

    .line 84
    .line 85
    invoke-static {}, LY/w;->T()V

    .line 86
    .line 87
    .line 88
    :cond_5
    :goto_3
    invoke-interface {p2}, LY/m;->k()LY/B1;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    if-eqz p2, :cond_6

    .line 93
    .line 94
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ImagePreviewsKt$ProvidePreviewImageLoader$1;

    .line 95
    .line 96
    invoke-direct {v0, p0, p1, p3}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ImagePreviewsKt$ProvidePreviewImageLoader$1;-><init>(Lv4/d;Lkotlin/jvm/functions/Function2;I)V

    .line 97
    .line 98
    .line 99
    invoke-interface {p2, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 100
    .line 101
    .line 102
    :cond_6
    return-void
.end method

.method public static final getLocalPreviewImageLoader()LY/b1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LY/b1;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ImagePreviewsKt;->LocalPreviewImageLoader:LY/b1;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic getPreviewPlaceholderBlocking(Lv4/d;LG4/h;)Lw0/b;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p0, "imageRequest"

    .line 7
    .line 8
    invoke-static {p1, p0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return-object p0
.end method
