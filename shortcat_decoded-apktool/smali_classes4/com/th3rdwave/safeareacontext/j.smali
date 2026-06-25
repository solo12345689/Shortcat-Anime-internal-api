.class public final synthetic Lcom/th3rdwave/safeareacontext/j;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ljava/util/concurrent/locks/ReentrantLock;

.field public final synthetic b:Lkotlin/jvm/internal/J;

.field public final synthetic c:Ljava/util/concurrent/locks/Condition;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/locks/ReentrantLock;Lkotlin/jvm/internal/J;Ljava/util/concurrent/locks/Condition;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/th3rdwave/safeareacontext/j;->a:Ljava/util/concurrent/locks/ReentrantLock;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/th3rdwave/safeareacontext/j;->b:Lkotlin/jvm/internal/J;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/th3rdwave/safeareacontext/j;->c:Ljava/util/concurrent/locks/Condition;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/th3rdwave/safeareacontext/j;->a:Ljava/util/concurrent/locks/ReentrantLock;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/th3rdwave/safeareacontext/j;->b:Lkotlin/jvm/internal/J;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/th3rdwave/safeareacontext/j;->c:Ljava/util/concurrent/locks/Condition;

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Lcom/th3rdwave/safeareacontext/k;->B(Ljava/util/concurrent/locks/ReentrantLock;Lkotlin/jvm/internal/J;Ljava/util/concurrent/locks/Condition;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
