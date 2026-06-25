.class public final synthetic LT6/s;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:LT6/t;

.field public final synthetic b:Lcom/facebook/react/uimanager/events/d;


# direct methods
.method public synthetic constructor <init>(LT6/t;Lcom/facebook/react/uimanager/events/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LT6/s;->a:LT6/t;

    .line 5
    .line 6
    iput-object p2, p0, LT6/s;->b:Lcom/facebook/react/uimanager/events/d;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, LT6/s;->a:LT6/t;

    .line 2
    .line 3
    iget-object v1, p0, LT6/s;->b:Lcom/facebook/react/uimanager/events/d;

    .line 4
    .line 5
    invoke-static {v0, v1}, LT6/t;->a(LT6/t;Lcom/facebook/react/uimanager/events/d;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
