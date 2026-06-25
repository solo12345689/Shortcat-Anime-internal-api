.class LE9/e$a;
.super Lz1/k$e;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE9/e;->g(Landroid/content/Context;LE9/g;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LE9/g;

.field final synthetic b:LE9/e;


# direct methods
.method constructor <init>(LE9/e;LE9/g;)V
    .locals 0

    .line 1
    iput-object p1, p0, LE9/e$a;->b:LE9/e;

    .line 2
    .line 3
    iput-object p2, p0, LE9/e$a;->a:LE9/g;

    .line 4
    .line 5
    invoke-direct {p0}, Lz1/k$e;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public f(I)V
    .locals 2

    .line 1
    iget-object v0, p0, LE9/e$a;->b:LE9/e;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {v0, v1}, LE9/e;->c(LE9/e;Z)Z

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, LE9/e$a;->a:LE9/g;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, LE9/g;->a(I)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public g(Landroid/graphics/Typeface;)V
    .locals 2

    .line 1
    iget-object v0, p0, LE9/e$a;->b:LE9/e;

    .line 2
    .line 3
    iget v1, v0, LE9/e;->f:I

    .line 4
    .line 5
    invoke-static {p1, v1}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-static {v0, p1}, LE9/e;->b(LE9/e;Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, LE9/e$a;->b:LE9/e;

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    invoke-static {p1, v0}, LE9/e;->c(LE9/e;Z)Z

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, LE9/e$a;->a:LE9/g;

    .line 19
    .line 20
    iget-object v0, p0, LE9/e$a;->b:LE9/e;

    .line 21
    .line 22
    invoke-static {v0}, LE9/e;->a(LE9/e;)Landroid/graphics/Typeface;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const/4 v1, 0x0

    .line 27
    invoke-virtual {p1, v0, v1}, LE9/g;->b(Landroid/graphics/Typeface;Z)V

    .line 28
    .line 29
    .line 30
    return-void
.end method
