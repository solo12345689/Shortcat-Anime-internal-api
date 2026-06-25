.class public final Lw2/k;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lt2/h;


# static fields
.field public static final e:LO9/t;


# instance fields
.field private final a:Lcom/google/common/util/concurrent/r;

.field private final b:Lw2/g$a;

.field private final c:Landroid/graphics/BitmapFactory$Options;

.field private final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lw2/h;

    .line 2
    .line 3
    invoke-direct {v0}, Lw2/h;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, LO9/u;->a(LO9/t;)LO9/t;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, Lw2/k;->e:LO9/t;

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    sget-object v0, Lw2/k;->e:LO9/t;

    invoke-interface {v0}, LO9/t;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/common/util/concurrent/r;

    invoke-static {v0}, Lt2/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/common/util/concurrent/r;

    new-instance v1, Lw2/p$a;

    invoke-direct {v1, p1}, Lw2/p$a;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, v0, v1}, Lw2/k;-><init>(Lcom/google/common/util/concurrent/r;Lw2/g$a;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/common/util/concurrent/r;Lw2/g$a;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lw2/k;-><init>(Lcom/google/common/util/concurrent/r;Lw2/g$a;Landroid/graphics/BitmapFactory$Options;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/common/util/concurrent/r;Lw2/g$a;Landroid/graphics/BitmapFactory$Options;)V
    .locals 1

    const/4 v0, -0x1

    .line 3
    invoke-direct {p0, p1, p2, p3, v0}, Lw2/k;-><init>(Lcom/google/common/util/concurrent/r;Lw2/g$a;Landroid/graphics/BitmapFactory$Options;I)V

    return-void
.end method

.method public constructor <init>(Lcom/google/common/util/concurrent/r;Lw2/g$a;Landroid/graphics/BitmapFactory$Options;I)V
    .locals 0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lw2/k;->a:Lcom/google/common/util/concurrent/r;

    .line 6
    iput-object p2, p0, Lw2/k;->b:Lw2/g$a;

    .line 7
    iput-object p3, p0, Lw2/k;->c:Landroid/graphics/BitmapFactory$Options;

    .line 8
    iput p4, p0, Lw2/k;->d:I

    return-void
.end method

.method public static synthetic d(Lw2/k;[B)Landroid/graphics/Bitmap;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    array-length v0, p1

    .line 5
    iget-object v1, p0, Lw2/k;->c:Landroid/graphics/BitmapFactory$Options;

    .line 6
    .line 7
    iget p0, p0, Lw2/k;->d:I

    .line 8
    .line 9
    invoke-static {p1, v0, v1, p0}, Lw2/c;->a([BILandroid/graphics/BitmapFactory$Options;I)Landroid/graphics/Bitmap;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public static synthetic e()Lcom/google/common/util/concurrent/r;
    .locals 1

    .line 1
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lcom/google/common/util/concurrent/s;->b(Ljava/util/concurrent/ExecutorService;)Lcom/google/common/util/concurrent/r;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public static synthetic f(Lw2/k;Landroid/net/Uri;)Landroid/graphics/Bitmap;
    .locals 2

    .line 1
    iget-object v0, p0, Lw2/k;->b:Lw2/g$a;

    .line 2
    .line 3
    invoke-interface {v0}, Lw2/g$a;->a()Lw2/g;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lw2/k;->c:Landroid/graphics/BitmapFactory$Options;

    .line 8
    .line 9
    iget p0, p0, Lw2/k;->d:I

    .line 10
    .line 11
    invoke-static {v0, p1, v1, p0}, Lw2/k;->g(Lw2/g;Landroid/net/Uri;Landroid/graphics/BitmapFactory$Options;I)Landroid/graphics/Bitmap;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method private static g(Lw2/g;Landroid/net/Uri;Landroid/graphics/BitmapFactory$Options;I)Landroid/graphics/Bitmap;
    .locals 1

    .line 1
    :try_start_0
    new-instance v0, Lw2/o;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lw2/o;-><init>(Landroid/net/Uri;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0, v0}, Lw2/g;->a(Lw2/o;)J

    .line 7
    .line 8
    .line 9
    invoke-static {p0}, Lw2/n;->b(Lw2/g;)[B

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    array-length v0, p1

    .line 14
    invoke-static {p1, v0, p2, p3}, Lw2/c;->a([BILandroid/graphics/BitmapFactory$Options;I)Landroid/graphics/Bitmap;

    .line 15
    .line 16
    .line 17
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    invoke-interface {p0}, Lw2/g;->close()V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    invoke-interface {p0}, Lw2/g;->close()V

    .line 24
    .line 25
    .line 26
    throw p1
.end method


# virtual methods
.method public b(Landroid/net/Uri;)Lcom/google/common/util/concurrent/p;
    .locals 2

    .line 1
    iget-object v0, p0, Lw2/k;->a:Lcom/google/common/util/concurrent/r;

    .line 2
    .line 3
    new-instance v1, Lw2/j;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, Lw2/j;-><init>(Lw2/k;Landroid/net/Uri;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1}, Lcom/google/common/util/concurrent/r;->submit(Ljava/util/concurrent/Callable;)Lcom/google/common/util/concurrent/p;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public c([B)Lcom/google/common/util/concurrent/p;
    .locals 2

    .line 1
    iget-object v0, p0, Lw2/k;->a:Lcom/google/common/util/concurrent/r;

    .line 2
    .line 3
    new-instance v1, Lw2/i;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, Lw2/i;-><init>(Lw2/k;[B)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1}, Lcom/google/common/util/concurrent/r;->submit(Ljava/util/concurrent/Callable;)Lcom/google/common/util/concurrent/p;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method
