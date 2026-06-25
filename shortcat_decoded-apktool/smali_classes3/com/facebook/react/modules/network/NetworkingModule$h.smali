.class public final Lcom/facebook/react/modules/network/NetworkingModule$h;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lv7/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/modules/network/NetworkingModule;->wrapRequestBodyWithProgressEmitter(Ldg/D;I)Ldg/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private a:J

.field final synthetic b:Lcom/facebook/react/bridge/ReactApplicationContext;

.field final synthetic c:I


# direct methods
.method constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/modules/network/NetworkingModule$h;->b:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 2
    .line 3
    iput p2, p0, Lcom/facebook/react/modules/network/NetworkingModule$h;->c:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 9
    .line 10
    .line 11
    move-result-wide p1

    .line 12
    iput-wide p1, p0, Lcom/facebook/react/modules/network/NetworkingModule$h;->a:J

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public a(JJZ)V
    .locals 8

    .line 1
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    if-nez p5, :cond_1

    .line 6
    .line 7
    sget-object p5, Lcom/facebook/react/modules/network/NetworkingModule;->Companion:Lcom/facebook/react/modules/network/NetworkingModule$a;

    .line 8
    .line 9
    iget-wide v2, p0, Lcom/facebook/react/modules/network/NetworkingModule$h;->a:J

    .line 10
    .line 11
    invoke-static {p5, v0, v1, v2, v3}, Lcom/facebook/react/modules/network/NetworkingModule$a;->b(Lcom/facebook/react/modules/network/NetworkingModule$a;JJ)Z

    .line 12
    .line 13
    .line 14
    move-result p5

    .line 15
    if-eqz p5, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    return-void

    .line 19
    :cond_1
    :goto_0
    iget-object v2, p0, Lcom/facebook/react/modules/network/NetworkingModule$h;->b:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 20
    .line 21
    iget v3, p0, Lcom/facebook/react/modules/network/NetworkingModule$h;->c:I

    .line 22
    .line 23
    move-wide v4, p1

    .line 24
    move-wide v6, p3

    .line 25
    invoke-static/range {v2 .. v7}, Lv7/e;->f(Lcom/facebook/react/bridge/ReactApplicationContext;IJJ)V

    .line 26
    .line 27
    .line 28
    iput-wide v0, p0, Lcom/facebook/react/modules/network/NetworkingModule$h;->a:J

    .line 29
    .line 30
    return-void
.end method
