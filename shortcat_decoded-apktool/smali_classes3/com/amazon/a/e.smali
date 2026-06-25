.class public Lcom/amazon/a/e;
.super Lcom/amazon/a/a/n/c/b;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/amazon/a/a/n/c/b;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/amazon/a/c;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/amazon/a/c;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lcom/amazon/a/a/n/c/b;->a(Lcom/amazon/a/a/n/a;)V

    .line 10
    .line 11
    .line 12
    new-instance v0, Lcom/amazon/a/a/b/b/a;

    .line 13
    .line 14
    invoke-direct {v0}, Lcom/amazon/a/a/b/b/a;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0}, Lcom/amazon/a/a/n/c/b;->a(Lcom/amazon/a/a/n/a;)V

    .line 18
    .line 19
    .line 20
    new-instance v0, Lcom/amazon/a/a/h/a/a;

    .line 21
    .line 22
    invoke-direct {v0}, Lcom/amazon/a/a/h/a/a;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v0}, Lcom/amazon/a/a/n/c/b;->a(Lcom/amazon/a/a/n/a;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method protected b_()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "DrmFreeApplicationLaunchTaskWorkflow"

    .line 2
    .line 3
    return-object v0
.end method
