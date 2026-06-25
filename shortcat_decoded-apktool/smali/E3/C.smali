.class public final synthetic LE3/C;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/util/concurrent/Executor;


# instance fields
.field public final synthetic a:LE3/D;


# direct methods
.method public synthetic constructor <init>(LE3/D;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LE3/C;->a:LE3/D;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final execute(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    iget-object v0, p0, LE3/C;->a:LE3/D;

    .line 2
    .line 3
    invoke-static {v0, p1}, LE3/D;->J(LE3/D;Ljava/lang/Runnable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
