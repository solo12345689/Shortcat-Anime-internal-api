.class Lcom/github/penfeizhou/animation/glide/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lg5/e;


# instance fields
.field private final a:LV4/d;


# direct methods
.method constructor <init>(LV4/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/github/penfeizhou/animation/glide/a;->a:LV4/d;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(LU4/v;LS4/h;)LU4/v;
    .locals 0

    .line 1
    invoke-interface {p1}, LU4/v;->get()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/github/penfeizhou/animation/decode/b;

    .line 6
    .line 7
    const/4 p2, 0x0

    .line 8
    :try_start_0
    invoke-virtual {p1, p2}, Lcom/github/penfeizhou/animation/decode/b;->v(I)Landroid/graphics/Bitmap;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget-object p2, p0, Lcom/github/penfeizhou/animation/glide/a;->a:LV4/d;

    .line 13
    .line 14
    invoke-static {p1, p2}, Lb5/g;->c(Landroid/graphics/Bitmap;LV4/d;)Lb5/g;

    .line 15
    .line 16
    .line 17
    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    return-object p1

    .line 19
    :catch_0
    move-exception p1

    .line 20
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 21
    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    return-object p1
.end method
