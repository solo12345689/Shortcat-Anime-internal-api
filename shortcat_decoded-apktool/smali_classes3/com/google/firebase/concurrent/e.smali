.class public final synthetic Lcom/google/firebase/concurrent/e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ljava/lang/Runnable;

.field public final synthetic b:Lcom/google/firebase/concurrent/p$b;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Runnable;Lcom/google/firebase/concurrent/p$b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/firebase/concurrent/e;->a:Ljava/lang/Runnable;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/firebase/concurrent/e;->b:Lcom/google/firebase/concurrent/p$b;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/firebase/concurrent/e;->a:Ljava/lang/Runnable;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/firebase/concurrent/e;->b:Lcom/google/firebase/concurrent/p$b;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/google/firebase/concurrent/o;->q(Ljava/lang/Runnable;Lcom/google/firebase/concurrent/p$b;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
