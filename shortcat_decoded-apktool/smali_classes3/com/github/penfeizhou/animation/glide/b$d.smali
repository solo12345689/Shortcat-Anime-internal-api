.class Lcom/github/penfeizhou/animation/glide/b$d;
.super Ld5/j;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/github/penfeizhou/animation/glide/b;->a(LU4/v;LS4/h;)LU4/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lb8/a;

.field final synthetic c:Lcom/github/penfeizhou/animation/glide/b;


# direct methods
.method constructor <init>(Lcom/github/penfeizhou/animation/glide/b;Landroid/graphics/drawable/Drawable;Lb8/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/github/penfeizhou/animation/glide/b$d;->c:Lcom/github/penfeizhou/animation/glide/b;

    .line 2
    .line 3
    iput-object p3, p0, Lcom/github/penfeizhou/animation/glide/b$d;->b:Lb8/a;

    .line 4
    .line 5
    invoke-direct {p0, p2}, Ld5/j;-><init>(Landroid/graphics/drawable/Drawable;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Class;
    .locals 1

    .line 1
    const-class v0, Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    return-object v0
.end method

.method public getSize()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/github/penfeizhou/animation/glide/b$d;->b:Lb8/a;

    .line 2
    .line 3
    invoke-virtual {v0}, LX7/a;->e()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public initialize()V
    .locals 0

    .line 1
    invoke-super {p0}, Ld5/j;->initialize()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public recycle()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/github/penfeizhou/animation/glide/b$d;->b:Lb8/a;

    .line 2
    .line 3
    invoke-virtual {v0}, LX7/a;->stop()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
