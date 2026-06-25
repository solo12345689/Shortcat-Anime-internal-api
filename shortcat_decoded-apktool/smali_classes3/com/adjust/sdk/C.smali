.class public final synthetic Lcom/adjust/sdk/C;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/adjust/sdk/IRunActivityHandler;


# instance fields
.field public final synthetic a:Z


# direct methods
.method public synthetic constructor <init>(Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lcom/adjust/sdk/C;->a:Z

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final run(Lcom/adjust/sdk/ActivityHandler;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/adjust/sdk/C;->a:Z

    .line 2
    .line 3
    invoke-static {v0, p1}, Lcom/adjust/sdk/ActivityHandler;->L(ZLcom/adjust/sdk/ActivityHandler;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
