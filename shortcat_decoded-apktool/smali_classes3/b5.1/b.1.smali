.class public Lb5/b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LS4/k;


# instance fields
.field private final a:LV4/d;

.field private final b:LS4/k;


# direct methods
.method public constructor <init>(LV4/d;LS4/k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lb5/b;->a:LV4/d;

    .line 5
    .line 6
    iput-object p2, p0, Lb5/b;->b:LS4/k;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(LS4/h;)LS4/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lb5/b;->b:LS4/k;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LS4/k;->a(LS4/h;)LS4/c;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;Ljava/io/File;LS4/h;)Z
    .locals 0

    .line 1
    check-cast p1, LU4/v;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Lb5/b;->c(LU4/v;Ljava/io/File;LS4/h;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public c(LU4/v;Ljava/io/File;LS4/h;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lb5/b;->b:LS4/k;

    .line 2
    .line 3
    new-instance v1, Lb5/g;

    .line 4
    .line 5
    invoke-interface {p1}, LU4/v;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Landroid/graphics/drawable/BitmapDrawable;

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-object v2, p0, Lb5/b;->a:LV4/d;

    .line 16
    .line 17
    invoke-direct {v1, p1, v2}, Lb5/g;-><init>(Landroid/graphics/Bitmap;LV4/d;)V

    .line 18
    .line 19
    .line 20
    invoke-interface {v0, v1, p2, p3}, LS4/d;->b(Ljava/lang/Object;Ljava/io/File;LS4/h;)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    return p1
.end method
