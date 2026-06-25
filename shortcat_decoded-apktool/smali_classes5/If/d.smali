.class public final synthetic LIf/d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/o;


# instance fields
.field public final synthetic a:Ljava/lang/Object;

.field public final synthetic b:LIf/e;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;LIf/e;LOf/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LIf/d;->a:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, LIf/d;->b:LIf/e;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, LIf/d;->a:Ljava/lang/Object;

    .line 2
    .line 3
    iget-object v1, p0, LIf/d;->b:LIf/e;

    .line 4
    .line 5
    move-object v3, p1

    .line 6
    check-cast v3, Ljava/lang/Throwable;

    .line 7
    .line 8
    move-object v5, p3

    .line 9
    check-cast v5, LZd/i;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    move-object v4, p2

    .line 13
    invoke-static/range {v0 .. v5}, LIf/e;->b(Ljava/lang/Object;LIf/e;LOf/a;Ljava/lang/Throwable;Ljava/lang/Object;LZd/i;)LTd/L;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method
