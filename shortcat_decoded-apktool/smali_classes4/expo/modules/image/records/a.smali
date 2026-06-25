.class public final Lexpo/modules/image/records/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lexpo/modules/image/records/b;


# instance fields
.field private final a:Landroid/graphics/drawable/Drawable;

.field private final b:I

.field private final c:I

.field private final d:D


# direct methods
.method public constructor <init>(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 1
    const-string v0, "drawable"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lexpo/modules/image/records/a;->a:Landroid/graphics/drawable/Drawable;

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iput v0, p0, Lexpo/modules/image/records/a;->b:I

    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    iput p1, p0, Lexpo/modules/image/records/a;->c:I

    .line 22
    .line 23
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    .line 24
    .line 25
    iput-wide v0, p0, Lexpo/modules/image/records/a;->d:D

    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public createGlideModelProvider(Landroid/content/Context;)LIb/k;
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p1, LIb/e;

    .line 7
    .line 8
    iget-object v0, p0, Lexpo/modules/image/records/a;->a:Landroid/graphics/drawable/Drawable;

    .line 9
    .line 10
    invoke-direct {p1, v0}, LIb/e;-><init>(Landroid/graphics/drawable/Drawable;)V

    .line 11
    .line 12
    .line 13
    return-object p1
.end method

.method public createGlideOptions(Landroid/content/Context;)Lk5/f;
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p1, Lk5/f;

    .line 7
    .line 8
    invoke-direct {p1}, Lk5/f;-><init>()V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    invoke-virtual {p1, v0}, Lk5/a;->c0(Z)Lk5/a;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Lk5/f;

    .line 17
    .line 18
    sget-object v0, LU4/j;->b:LU4/j;

    .line 19
    .line 20
    invoke-virtual {p1, v0}, Lk5/a;->g(LU4/j;)Lk5/a;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    const-string v0, "diskCacheStrategy(...)"

    .line 25
    .line 26
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    check-cast p1, Lk5/f;

    .line 30
    .line 31
    return-object p1
.end method

.method public getHeight()I
    .locals 1

    .line 1
    iget v0, p0, Lexpo/modules/image/records/a;->c:I

    .line 2
    .line 3
    return v0
.end method

.method public getPixelCount()D
    .locals 2

    .line 1
    invoke-static {p0}, Lexpo/modules/image/records/b$a;->a(Lexpo/modules/image/records/b;)D

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
.end method

.method public getScale()D
    .locals 2

    .line 1
    iget-wide v0, p0, Lexpo/modules/image/records/a;->d:D

    .line 2
    .line 3
    return-wide v0
.end method

.method public getWidth()I
    .locals 1

    .line 1
    iget v0, p0, Lexpo/modules/image/records/a;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public usesPlaceholderContentFit()Z
    .locals 1

    .line 1
    invoke-static {p0}, Lexpo/modules/image/records/b$a;->b(Lexpo/modules/image/records/b;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method
