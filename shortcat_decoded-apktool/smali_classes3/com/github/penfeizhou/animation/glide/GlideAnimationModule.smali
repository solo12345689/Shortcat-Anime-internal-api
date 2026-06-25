.class public Lcom/github/penfeizhou/animation/glide/GlideAnimationModule;
.super Li5/b;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Li5/b;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Lcom/bumptech/glide/b;Lcom/bumptech/glide/h;)V
    .locals 3

    .line 1
    invoke-super {p0, p1, p2, p3}, Li5/b;->a(Landroid/content/Context;Lcom/bumptech/glide/b;Lcom/bumptech/glide/h;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Li8/b;

    .line 5
    .line 6
    invoke-direct {p1}, Li8/b;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v0, Li8/c;

    .line 10
    .line 11
    invoke-direct {v0, p1}, Li8/c;-><init>(LS4/j;)V

    .line 12
    .line 13
    .line 14
    const-class v1, Ljava/io/InputStream;

    .line 15
    .line 16
    const-class v2, Lcom/github/penfeizhou/animation/decode/b;

    .line 17
    .line 18
    invoke-virtual {p3, v1, v2, v0}, Lcom/bumptech/glide/h;->o(Ljava/lang/Class;Ljava/lang/Class;LS4/j;)Lcom/bumptech/glide/h;

    .line 19
    .line 20
    .line 21
    const-class v0, Ljava/nio/ByteBuffer;

    .line 22
    .line 23
    invoke-virtual {p3, v0, v2, p1}, Lcom/bumptech/glide/h;->o(Ljava/lang/Class;Ljava/lang/Class;LS4/j;)Lcom/bumptech/glide/h;

    .line 24
    .line 25
    .line 26
    new-instance p1, Lcom/github/penfeizhou/animation/glide/b;

    .line 27
    .line 28
    invoke-direct {p1}, Lcom/github/penfeizhou/animation/glide/b;-><init>()V

    .line 29
    .line 30
    .line 31
    const-class v0, Landroid/graphics/drawable/Drawable;

    .line 32
    .line 33
    invoke-virtual {p3, v2, v0, p1}, Lcom/bumptech/glide/h;->t(Ljava/lang/Class;Ljava/lang/Class;Lg5/e;)Lcom/bumptech/glide/h;

    .line 34
    .line 35
    .line 36
    new-instance p1, Lcom/github/penfeizhou/animation/glide/a;

    .line 37
    .line 38
    invoke-virtual {p2}, Lcom/bumptech/glide/b;->g()LV4/d;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    invoke-direct {p1, p2}, Lcom/github/penfeizhou/animation/glide/a;-><init>(LV4/d;)V

    .line 43
    .line 44
    .line 45
    const-class p2, Landroid/graphics/Bitmap;

    .line 46
    .line 47
    invoke-virtual {p3, v2, p2, p1}, Lcom/bumptech/glide/h;->t(Ljava/lang/Class;Ljava/lang/Class;Lg5/e;)Lcom/bumptech/glide/h;

    .line 48
    .line 49
    .line 50
    return-void
.end method
