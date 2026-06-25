.class public final synthetic Ly7/g;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ly7/a;


# instance fields
.field public final synthetic a:Ly7/o;

.field public final synthetic b:Ly7/a;

.field public final synthetic c:Ljava/util/concurrent/Executor;


# direct methods
.method public synthetic constructor <init>(Ly7/o;Ly7/a;Ljava/util/concurrent/Executor;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ly7/g;->a:Ly7/o;

    .line 5
    .line 6
    iput-object p2, p0, Ly7/g;->b:Ly7/a;

    .line 7
    .line 8
    iput-object p3, p0, Ly7/g;->c:Ljava/util/concurrent/Executor;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(Ly7/n;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Ly7/g;->a:Ly7/o;

    .line 2
    .line 3
    iget-object v1, p0, Ly7/g;->b:Ly7/a;

    .line 4
    .line 5
    iget-object v2, p0, Ly7/g;->c:Ljava/util/concurrent/Executor;

    .line 6
    .line 7
    invoke-static {v0, v1, v2, p1}, Ly7/n;->c(Ly7/o;Ly7/a;Ljava/util/concurrent/Executor;Ly7/n;)LTd/L;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method
