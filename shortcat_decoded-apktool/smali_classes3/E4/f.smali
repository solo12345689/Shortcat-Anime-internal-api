.class public final LE4/f;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LE4/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LE4/f$a;
    }
.end annotation


# instance fields
.field private final a:LE4/i;

.field private final b:LE4/f$b;


# direct methods
.method public constructor <init>(ILE4/i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, LE4/f;->a:LE4/i;

    .line 5
    .line 6
    new-instance p2, LE4/f$b;

    .line 7
    .line 8
    invoke-direct {p2, p1, p0}, LE4/f$b;-><init>(ILE4/f;)V

    .line 9
    .line 10
    .line 11
    iput-object p2, p0, LE4/f;->b:LE4/f$b;

    .line 12
    .line 13
    return-void
.end method

.method public static final synthetic d(LE4/f;)LE4/i;
    .locals 0

    .line 1
    iget-object p0, p0, LE4/f;->a:LE4/i;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public a(I)V
    .locals 1

    .line 1
    const/16 v0, 0x28

    .line 2
    .line 3
    if-lt p1, v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, LE4/f;->e()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    const/16 v0, 0xa

    .line 10
    .line 11
    if-gt v0, p1, :cond_1

    .line 12
    .line 13
    const/16 v0, 0x14

    .line 14
    .line 15
    if-ge p1, v0, :cond_1

    .line 16
    .line 17
    iget-object p1, p0, LE4/f;->b:LE4/f$b;

    .line 18
    .line 19
    invoke-virtual {p0}, LE4/f;->g()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    div-int/lit8 v0, v0, 0x2

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Lt/z;->l(I)V

    .line 26
    .line 27
    .line 28
    :cond_1
    return-void
.end method

.method public b(LE4/c$b;)LE4/c$c;
    .locals 2

    .line 1
    iget-object v0, p0, LE4/f;->b:LE4/f$b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lt/z;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, LE4/f$a;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    new-instance v0, LE4/c$c;

    .line 12
    .line 13
    invoke-virtual {p1}, LE4/f$a;->a()Landroid/graphics/Bitmap;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {p1}, LE4/f$a;->b()Ljava/util/Map;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-direct {v0, v1, p1}, LE4/c$c;-><init>(Landroid/graphics/Bitmap;Ljava/util/Map;)V

    .line 22
    .line 23
    .line 24
    return-object v0

    .line 25
    :cond_0
    const/4 p1, 0x0

    .line 26
    return-object p1
.end method

.method public c(LE4/c$b;Landroid/graphics/Bitmap;Ljava/util/Map;)V
    .locals 3

    .line 1
    invoke-static {p2}, LL4/a;->a(Landroid/graphics/Bitmap;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, LE4/f;->f()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-gt v0, v1, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, LE4/f;->b:LE4/f$b;

    .line 12
    .line 13
    new-instance v2, LE4/f$a;

    .line 14
    .line 15
    invoke-direct {v2, p2, p3, v0}, LE4/f$a;-><init>(Landroid/graphics/Bitmap;Ljava/util/Map;I)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, p1, v2}, Lt/z;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    iget-object v1, p0, LE4/f;->b:LE4/f$b;

    .line 23
    .line 24
    invoke-virtual {v1, p1}, Lt/z;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    iget-object v1, p0, LE4/f;->a:LE4/i;

    .line 28
    .line 29
    invoke-interface {v1, p1, p2, p3, v0}, LE4/i;->c(LE4/c$b;Landroid/graphics/Bitmap;Ljava/util/Map;I)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public e()V
    .locals 1

    .line 1
    iget-object v0, p0, LE4/f;->b:LE4/f$b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lt/z;->c()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public f()I
    .locals 1

    .line 1
    iget-object v0, p0, LE4/f;->b:LE4/f$b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lt/z;->e()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public g()I
    .locals 1

    .line 1
    iget-object v0, p0, LE4/f;->b:LE4/f$b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lt/z;->i()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
