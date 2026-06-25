.class public final synthetic LPf/i;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/o;


# instance fields
.field public final synthetic a:LPf/j;


# direct methods
.method public synthetic constructor <init>(LPf/j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LPf/i;->a:LPf/j;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LPf/i;->a:LPf/j;

    .line 2
    .line 3
    check-cast p1, Ljava/lang/Throwable;

    .line 4
    .line 5
    check-cast p2, LTd/L;

    .line 6
    .line 7
    check-cast p3, LZd/i;

    .line 8
    .line 9
    invoke-static {v0, p1, p2, p3}, LPf/j;->f(LPf/j;Ljava/lang/Throwable;LTd/L;LZd/i;)LTd/L;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method
