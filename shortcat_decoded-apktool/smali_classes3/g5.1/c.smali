.class public final Lg5/c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lg5/e;


# instance fields
.field private final a:LV4/d;

.field private final b:Lg5/e;

.field private final c:Lg5/e;


# direct methods
.method public constructor <init>(LV4/d;Lg5/e;Lg5/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lg5/c;->a:LV4/d;

    .line 5
    .line 6
    iput-object p2, p0, Lg5/c;->b:Lg5/e;

    .line 7
    .line 8
    iput-object p3, p0, Lg5/c;->c:Lg5/e;

    .line 9
    .line 10
    return-void
.end method

.method private static b(LU4/v;)LU4/v;
    .locals 0

    .line 1
    return-object p0
.end method


# virtual methods
.method public a(LU4/v;LS4/h;)LU4/v;
    .locals 2

    .line 1
    invoke-interface {p1}, LU4/v;->get()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    instance-of v1, v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object p1, p0, Lg5/c;->b:Lg5/e;

    .line 12
    .line 13
    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v1, p0, Lg5/c;->a:LV4/d;

    .line 20
    .line 21
    invoke-static {v0, v1}, Lb5/g;->c(Landroid/graphics/Bitmap;LV4/d;)Lb5/g;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-interface {p1, v0, p2}, Lg5/e;->a(LU4/v;LS4/h;)LU4/v;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    return-object p1

    .line 30
    :cond_0
    instance-of v0, v0, Lf5/c;

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    iget-object v0, p0, Lg5/c;->c:Lg5/e;

    .line 35
    .line 36
    invoke-static {p1}, Lg5/c;->b(LU4/v;)LU4/v;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-interface {v0, p1, p2}, Lg5/e;->a(LU4/v;LS4/h;)LU4/v;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    return-object p1

    .line 45
    :cond_1
    const/4 p1, 0x0

    .line 46
    return-object p1
.end method
