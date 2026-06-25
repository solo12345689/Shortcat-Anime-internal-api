.class public final synthetic LE3/e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:LE3/g;

.field public final synthetic b:LE3/g$a;

.field public final synthetic c:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final synthetic d:LE3/g$b;

.field public final synthetic e:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public synthetic constructor <init>(LE3/g;LE3/g$a;Ljava/util/concurrent/atomic/AtomicBoolean;LE3/g$b;Ljava/util/concurrent/atomic/AtomicBoolean;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LE3/e;->a:LE3/g;

    .line 5
    .line 6
    iput-object p2, p0, LE3/e;->b:LE3/g$a;

    .line 7
    .line 8
    iput-object p3, p0, LE3/e;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 9
    .line 10
    iput-object p4, p0, LE3/e;->d:LE3/g$b;

    .line 11
    .line 12
    iput-object p5, p0, LE3/e;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget-object v0, p0, LE3/e;->a:LE3/g;

    .line 2
    .line 3
    iget-object v1, p0, LE3/e;->b:LE3/g$a;

    .line 4
    .line 5
    iget-object v2, p0, LE3/e;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 6
    .line 7
    iget-object v3, p0, LE3/e;->d:LE3/g$b;

    .line 8
    .line 9
    iget-object v4, p0, LE3/e;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 10
    .line 11
    invoke-static {v0, v1, v2, v3, v4}, LE3/g;->b(LE3/g;LE3/g$a;Ljava/util/concurrent/atomic/AtomicBoolean;LE3/g$b;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
