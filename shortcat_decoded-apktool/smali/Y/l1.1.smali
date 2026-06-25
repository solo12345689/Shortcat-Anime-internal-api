.class public final synthetic LY/l1;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:LY/Q;

.field public final synthetic b:Lt/Q;


# direct methods
.method public synthetic constructor <init>(LY/Q;Lt/Q;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LY/l1;->a:LY/Q;

    .line 5
    .line 6
    iput-object p2, p0, LY/l1;->b:Lt/Q;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, LY/l1;->a:LY/Q;

    .line 2
    .line 3
    iget-object v1, p0, LY/l1;->b:Lt/Q;

    .line 4
    .line 5
    invoke-static {v0, v1, p1}, LY/o1;->A(LY/Q;Lt/Q;Ljava/lang/Object;)LTd/L;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method
