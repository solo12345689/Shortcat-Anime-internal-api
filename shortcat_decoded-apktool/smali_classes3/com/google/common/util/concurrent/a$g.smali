.class final Lcom/google/common/util/concurrent/a$g;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/common/util/concurrent/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "g"
.end annotation


# instance fields
.field final a:Lcom/google/common/util/concurrent/a;

.field final b:Lcom/google/common/util/concurrent/p;


# direct methods
.method constructor <init>(Lcom/google/common/util/concurrent/a;Lcom/google/common/util/concurrent/p;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/common/util/concurrent/a$g;->a:Lcom/google/common/util/concurrent/a;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/common/util/concurrent/a$g;->b:Lcom/google/common/util/concurrent/p;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/common/util/concurrent/a$g;->a:Lcom/google/common/util/concurrent/a;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/google/common/util/concurrent/a;->e(Lcom/google/common/util/concurrent/a;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eq v0, p0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object v0, p0, Lcom/google/common/util/concurrent/a$g;->b:Lcom/google/common/util/concurrent/p;

    .line 11
    .line 12
    invoke-static {v0}, Lcom/google/common/util/concurrent/a;->g(Lcom/google/common/util/concurrent/p;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-static {}, Lcom/google/common/util/concurrent/a;->d()Lcom/google/common/util/concurrent/a$b;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    iget-object v2, p0, Lcom/google/common/util/concurrent/a$g;->a:Lcom/google/common/util/concurrent/a;

    .line 21
    .line 22
    invoke-virtual {v1, v2, p0, v0}, Lcom/google/common/util/concurrent/a$b;->b(Lcom/google/common/util/concurrent/a;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    iget-object v0, p0, Lcom/google/common/util/concurrent/a$g;->a:Lcom/google/common/util/concurrent/a;

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    invoke-static {v0, v1}, Lcom/google/common/util/concurrent/a;->h(Lcom/google/common/util/concurrent/a;Z)V

    .line 32
    .line 33
    .line 34
    :cond_1
    :goto_0
    return-void
.end method
