.class final Ldg/c$d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lhg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldg/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "d"
.end annotation


# instance fields
.field private final a:Lhg/d$b;

.field private final b:Ltg/X;

.field private final c:Ltg/X;

.field private d:Z

.field final synthetic e:Ldg/c;


# direct methods
.method public constructor <init>(Ldg/c;Lhg/d$b;)V
    .locals 1

    .line 1
    const-string v0, "editor"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Ldg/c$d;->e:Ldg/c;

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p2, p0, Ldg/c$d;->a:Lhg/d$b;

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    invoke-virtual {p2, v0}, Lhg/d$b;->f(I)Ltg/X;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    iput-object p2, p0, Ldg/c$d;->b:Ltg/X;

    .line 19
    .line 20
    new-instance v0, Ldg/c$d$a;

    .line 21
    .line 22
    invoke-direct {v0, p1, p0, p2}, Ldg/c$d$a;-><init>(Ldg/c;Ldg/c$d;Ltg/X;)V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Ldg/c$d;->c:Ltg/X;

    .line 26
    .line 27
    return-void
.end method

.method public static final synthetic c(Ldg/c$d;)Lhg/d$b;
    .locals 0

    .line 1
    iget-object p0, p0, Ldg/c$d;->a:Lhg/d$b;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 1
    iget-object v0, p0, Ldg/c$d;->e:Ldg/c;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Ldg/c$d;->d:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    monitor-exit v0

    .line 9
    return-void

    .line 10
    :cond_0
    const/4 v1, 0x1

    .line 11
    :try_start_1
    iput-boolean v1, p0, Ldg/c$d;->d:Z

    .line 12
    .line 13
    invoke-virtual {v0}, Ldg/c;->g()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    add-int/2addr v2, v1

    .line 18
    invoke-virtual {v0, v2}, Ldg/c;->l(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 19
    .line 20
    .line 21
    monitor-exit v0

    .line 22
    iget-object v0, p0, Ldg/c$d;->b:Ltg/X;

    .line 23
    .line 24
    invoke-static {v0}, Lfg/e;->m(Ljava/io/Closeable;)V

    .line 25
    .line 26
    .line 27
    :try_start_2
    iget-object v0, p0, Ldg/c$d;->a:Lhg/d$b;

    .line 28
    .line 29
    invoke-virtual {v0}, Lhg/d$b;->a()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 30
    .line 31
    .line 32
    :catch_0
    return-void

    .line 33
    :catchall_0
    move-exception v1

    .line 34
    monitor-exit v0

    .line 35
    throw v1
.end method

.method public b()Ltg/X;
    .locals 1

    .line 1
    iget-object v0, p0, Ldg/c$d;->c:Ltg/X;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ldg/c$d;->d:Z

    .line 2
    .line 3
    return v0
.end method

.method public final e(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Ldg/c$d;->d:Z

    .line 2
    .line 3
    return-void
.end method
