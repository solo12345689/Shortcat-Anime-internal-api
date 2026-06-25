.class public final synthetic Lcom/facebook/react/views/text/f;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/facebook/yoga/o;


# instance fields
.field public final synthetic a:Lcom/facebook/react/views/text/h;


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/react/views/text/h;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/facebook/react/views/text/f;->a:Lcom/facebook/react/views/text/h;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final measure(Lcom/facebook/yoga/r;FLcom/facebook/yoga/p;FLcom/facebook/yoga/p;)J
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/text/f;->a:Lcom/facebook/react/views/text/h;

    .line 2
    .line 3
    move-object v1, p1

    .line 4
    move v2, p2

    .line 5
    move-object v3, p3

    .line 6
    move v4, p4

    .line 7
    move-object v5, p5

    .line 8
    invoke-static/range {v0 .. v5}, Lcom/facebook/react/views/text/h;->J(Lcom/facebook/react/views/text/h;Lcom/facebook/yoga/r;FLcom/facebook/yoga/p;FLcom/facebook/yoga/p;)J

    .line 9
    .line 10
    .line 11
    move-result-wide p1

    .line 12
    return-wide p1
.end method
