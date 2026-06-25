.class public final LE4/e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LE4/c;


# instance fields
.field private final a:LE4/h;

.field private final b:LE4/i;


# direct methods
.method public constructor <init>(LE4/h;LE4/i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LE4/e;->a:LE4/h;

    .line 5
    .line 6
    iput-object p2, p0, LE4/e;->b:LE4/i;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 1

    .line 1
    iget-object v0, p0, LE4/e;->a:LE4/h;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LE4/h;->a(I)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LE4/e;->b:LE4/i;

    .line 7
    .line 8
    invoke-interface {v0, p1}, LE4/i;->a(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public b(LE4/c$b;)LE4/c$c;
    .locals 1

    .line 1
    iget-object v0, p0, LE4/e;->a:LE4/h;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LE4/h;->b(LE4/c$b;)LE4/c$c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, LE4/e;->b:LE4/i;

    .line 10
    .line 11
    invoke-interface {v0, p1}, LE4/i;->b(LE4/c$b;)LE4/c$c;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1

    .line 16
    :cond_0
    return-object v0
.end method

.method public c(LE4/c$b;LE4/c$c;)V
    .locals 4

    .line 1
    iget-object v0, p0, LE4/e;->a:LE4/h;

    .line 2
    .line 3
    invoke-virtual {p1}, LE4/c$b;->c()Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {v1}, LL4/c;->b(Ljava/util/Map;)Ljava/util/Map;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const/4 v2, 0x1

    .line 12
    const/4 v3, 0x0

    .line 13
    invoke-static {p1, v3, v1, v2, v3}, LE4/c$b;->b(LE4/c$b;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)LE4/c$b;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p2}, LE4/c$c;->a()Landroid/graphics/Bitmap;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {p2}, LE4/c$c;->b()Ljava/util/Map;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    invoke-static {p2}, LL4/c;->b(Ljava/util/Map;)Ljava/util/Map;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    invoke-interface {v0, p1, v1, p2}, LE4/h;->c(LE4/c$b;Landroid/graphics/Bitmap;Ljava/util/Map;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method
