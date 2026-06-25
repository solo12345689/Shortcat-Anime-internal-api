.class public final synthetic LVf/w;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:LVf/x;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/String;LVf/x;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, LVf/w;->a:I

    .line 5
    .line 6
    iput-object p2, p0, LVf/w;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, LVf/w;->c:LVf/x;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, LVf/w;->a:I

    .line 2
    .line 3
    iget-object v1, p0, LVf/w;->b:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, LVf/w;->c:LVf/x;

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, LVf/x;->A(ILjava/lang/String;LVf/x;)[LTf/e;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method
