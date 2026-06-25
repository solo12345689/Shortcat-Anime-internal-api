.class public final LJb/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/bumptech/glide/load/data/d;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:I

.field private final c:I

.field private final d:F


# direct methods
.method public constructor <init>(Ljava/lang/String;IIF)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LJb/a;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput p2, p0, LJb/a;->b:I

    .line 7
    .line 8
    iput p3, p0, LJb/a;->c:I

    .line 9
    .line 10
    iput p4, p0, LJb/a;->d:F

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Class;
    .locals 1

    .line 1
    const-class v0, Landroid/graphics/Bitmap;

    .line 2
    .line 3
    return-object v0
.end method

.method public b()V
    .locals 0

    .line 1
    return-void
.end method

.method public cancel()V
    .locals 0

    .line 1
    return-void
.end method

.method public d()LS4/a;
    .locals 1

    .line 1
    sget-object v0, LS4/a;->a:LS4/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public e(Lcom/bumptech/glide/g;Lcom/bumptech/glide/load/data/d$a;)V
    .locals 8

    .line 1
    const-string v0, "priority"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "callback"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, LJb/b;->a:LJb/b;

    .line 12
    .line 13
    iget-object v1, p0, LJb/a;->a:Ljava/lang/String;

    .line 14
    .line 15
    iget v2, p0, LJb/a;->b:I

    .line 16
    .line 17
    iget v3, p0, LJb/a;->c:I

    .line 18
    .line 19
    iget v4, p0, LJb/a;->d:F

    .line 20
    .line 21
    const/16 v6, 0x10

    .line 22
    .line 23
    const/4 v7, 0x0

    .line 24
    const/4 v5, 0x0

    .line 25
    invoke-static/range {v0 .. v7}, LJb/b;->d(LJb/b;Ljava/lang/String;IIFZILjava/lang/Object;)Landroid/graphics/Bitmap;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    if-nez p1, :cond_0

    .line 30
    .line 31
    new-instance p1, LJb/c;

    .line 32
    .line 33
    iget-object v0, p0, LJb/a;->a:Ljava/lang/String;

    .line 34
    .line 35
    invoke-direct {p1, v0}, LJb/c;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-interface {p2, p1}, Lcom/bumptech/glide/load/data/d$a;->c(Ljava/lang/Exception;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_0
    invoke-interface {p2, p1}, Lcom/bumptech/glide/load/data/d$a;->f(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    return-void
.end method
