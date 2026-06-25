.class public final LUd/M;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Iterable;
.implements Lje/a;


# instance fields
.field private final a:Lie/a;


# direct methods
.method public constructor <init>(Lie/a;)V
    .locals 1

    .line 1
    const-string v0, "iteratorFactory"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LUd/M;->a:Lie/a;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 2

    .line 1
    new-instance v0, LUd/N;

    .line 2
    .line 3
    iget-object v1, p0, LUd/M;->a:Lie/a;

    .line 4
    .line 5
    invoke-interface {v1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Ljava/util/Iterator;

    .line 10
    .line 11
    invoke-direct {v0, v1}, LUd/N;-><init>(Ljava/util/Iterator;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method
