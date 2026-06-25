.class public final synthetic LN8/v;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:LN8/x;

.field public final synthetic b:LN8/A;


# direct methods
.method public synthetic constructor <init>(LN8/x;LN8/A;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LN8/v;->a:LN8/x;

    .line 5
    .line 6
    iput-object p2, p0, LN8/v;->b:LN8/A;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, LN8/v;->a:LN8/x;

    .line 2
    .line 3
    iget-object v1, p0, LN8/v;->b:LN8/A;

    .line 4
    .line 5
    iget v1, v1, LN8/A;->a:I

    .line 6
    .line 7
    invoke-virtual {v0, v1}, LN8/x;->e(I)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
