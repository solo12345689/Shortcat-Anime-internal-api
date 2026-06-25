.class public final Lv7/l$a;
.super Ldg/D;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv7/l;->c(Ldg/x;Ljava/io/InputStream;)Ldg/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic b:Ldg/x;

.field final synthetic c:Ljava/io/InputStream;


# direct methods
.method constructor <init>(Ldg/x;Ljava/io/InputStream;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lv7/l$a;->b:Ldg/x;

    .line 2
    .line 3
    iput-object p2, p0, Lv7/l$a;->c:Ljava/io/InputStream;

    .line 4
    .line 5
    invoke-direct {p0}, Ldg/D;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lv7/l$a;->c:Ljava/io/InputStream;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    .line 4
    .line 5
    .line 6
    move-result v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    int-to-long v0, v0

    .line 8
    return-wide v0

    .line 9
    :catch_0
    const-wide/16 v0, 0x0

    .line 10
    .line 11
    return-wide v0
.end method

.method public b()Ldg/x;
    .locals 1

    .line 1
    iget-object v0, p0, Lv7/l$a;->b:Ldg/x;

    .line 2
    .line 3
    return-object v0
.end method

.method public f(Ltg/i;)V
    .locals 3

    .line 1
    const-string v0, "sink"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    :try_start_0
    invoke-static {}, Ltg/c;->a()Ltg/b;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v2, p0, Lv7/l$a;->c:Ljava/io/InputStream;

    .line 12
    .line 13
    invoke-virtual {v1, v2}, Ltg/b;->e(Ljava/io/InputStream;)Ltg/Z;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-interface {p1, v0}, Ltg/i;->O0(Ltg/Z;)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    sget-object p1, Lv7/l;->a:Lv7/l;

    .line 23
    .line 24
    invoke-static {p1, v0}, Lv7/l;->a(Lv7/l;Ltg/Z;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void

    .line 28
    :catchall_0
    move-exception p1

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    sget-object v1, Lv7/l;->a:Lv7/l;

    .line 32
    .line 33
    invoke-static {v1, v0}, Lv7/l;->a(Lv7/l;Ltg/Z;)V

    .line 34
    .line 35
    .line 36
    :cond_1
    throw p1
.end method
