.class public final Ltd/f$d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lvd/b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltd/f;->k()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Ltd/f;


# direct methods
.method constructor <init>(Ltd/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ltd/f$d;->a:Ltd/f;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic b(Ltd/f;Ljava/lang/Exception;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ltd/f$d;->d(Ltd/f;Ljava/lang/Exception;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic c(Ltd/f;)V
    .locals 0

    .line 1
    invoke-static {p0}, Ltd/f$d;->e(Ltd/f;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final d(Ltd/f;Ljava/lang/Exception;)V
    .locals 2

    .line 1
    invoke-static {p0}, Ltd/f;->b(Ltd/f;)Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Ltd/f;->c(Ltd/f;)Ljava/util/ArrayList;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    sget-object v0, Ltd/f$b;->b:Ltd/f$b;

    .line 13
    .line 14
    sget-object v1, Ltd/f$b;->c:Ltd/f$b;

    .line 15
    .line 16
    filled-new-array {v0, v1}, [Ltd/f$b;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {v0}, LUd/a0;->h([Ljava/lang/Object;)Ljava/util/Set;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Ljava/util/Collection;

    .line 25
    .line 26
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    .line 27
    .line 28
    .line 29
    invoke-static {p0}, Ltd/f;->d(Ltd/f;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method private static final e(Ltd/f;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p0, v0}, Ltd/f;->e(Ltd/f;Z)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, Ltd/f$d;->a:Ltd/f;

    .line 2
    .line 3
    new-instance v1, Ltd/g;

    .line 4
    .line 5
    invoke-direct {v1, v0}, Ltd/g;-><init>(Ltd/f;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public onFailure(Ljava/lang/Exception;)V
    .locals 2

    .line 1
    const-string v0, "e"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ltd/f$d;->a:Ltd/f;

    .line 7
    .line 8
    new-instance v1, Ltd/h;

    .line 9
    .line 10
    invoke-direct {v1, v0, p1}, Ltd/h;-><init>(Ltd/f;Ljava/lang/Exception;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 14
    .line 15
    .line 16
    return-void
.end method
