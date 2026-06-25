.class public final Lcom/facebook/react/devsupport/b$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/devsupport/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/devsupport/b$b;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lcom/facebook/react/devsupport/b$b;Ljava/lang/String;Ldg/t;Lcom/facebook/react/devsupport/b$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/react/devsupport/b$b;->c(Ljava/lang/String;Ldg/t;Lcom/facebook/react/devsupport/b$a;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic b(Lcom/facebook/react/devsupport/b$b;Ltg/j;Ljava/io/File;)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/devsupport/b$b;->d(Ltg/j;Ljava/io/File;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private final c(Ljava/lang/String;Ldg/t;Lcom/facebook/react/devsupport/b$a;)V
    .locals 0

    .line 1
    invoke-virtual {p3, p1}, Lcom/facebook/react/devsupport/b$a;->b(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    const-string p1, "X-Metro-Files-Changed-Count"

    .line 5
    .line 6
    invoke-virtual {p2, p1}, Ldg/t;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    :try_start_0
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    invoke-virtual {p3, p1}, Lcom/facebook/react/devsupport/b$a;->a(I)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :catch_0
    move-exception p1

    .line 21
    const/4 p2, -0x2

    .line 22
    invoke-virtual {p3, p2}, Lcom/facebook/react/devsupport/b$a;->a(I)V

    .line 23
    .line 24
    .line 25
    const-string p2, "BundleDownloader"

    .line 26
    .line 27
    const-string p3, "Can\'t populate bundle info: "

    .line 28
    .line 29
    invoke-static {p2, p3, p1}, Lz5/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    return-void
.end method

.method private final d(Ltg/j;Ljava/io/File;)Z
    .locals 1

    .line 1
    invoke-static {}, Ltg/c;->a()Ltg/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p2}, Ltg/b;->c(Ljava/io/File;)Ltg/X;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    :try_start_0
    invoke-interface {p1, p2}, Ltg/j;->U(Ltg/X;)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    invoke-static {p2, p1}, Lfe/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    return p1

    .line 18
    :catchall_0
    move-exception p1

    .line 19
    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 20
    :catchall_1
    move-exception v0

    .line 21
    invoke-static {p2, p1}, Lfe/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 22
    .line 23
    .line 24
    throw v0
.end method
