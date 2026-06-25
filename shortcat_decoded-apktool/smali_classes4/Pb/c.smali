.class public final LPb/c;
.super Landroid/graphics/drawable/PictureDrawable;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:I

.field private final b:I


# direct methods
.method public constructor <init>(Landroid/graphics/Picture;II)V
    .locals 1

    .line 1
    const-string v0, "picture"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Landroid/graphics/drawable/PictureDrawable;-><init>(Landroid/graphics/Picture;)V

    .line 7
    .line 8
    .line 9
    iput p2, p0, LPb/c;->a:I

    .line 10
    .line 11
    iput p3, p0, LPb/c;->b:I

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget v0, p0, LPb/c;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public final b()I
    .locals 1

    .line 1
    iget v0, p0, LPb/c;->a:I

    .line 2
    .line 3
    return v0
.end method
