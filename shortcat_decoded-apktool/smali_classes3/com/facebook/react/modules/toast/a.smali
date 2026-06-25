.class public final synthetic Lcom/facebook/react/modules/toast/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/facebook/react/modules/toast/ToastModule;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:I

.field public final synthetic d:I

.field public final synthetic e:I

.field public final synthetic f:I


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/react/modules/toast/ToastModule;Ljava/lang/String;IIII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/facebook/react/modules/toast/a;->a:Lcom/facebook/react/modules/toast/ToastModule;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/facebook/react/modules/toast/a;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput p3, p0, Lcom/facebook/react/modules/toast/a;->c:I

    .line 9
    .line 10
    iput p4, p0, Lcom/facebook/react/modules/toast/a;->d:I

    .line 11
    .line 12
    iput p5, p0, Lcom/facebook/react/modules/toast/a;->e:I

    .line 13
    .line 14
    iput p6, p0, Lcom/facebook/react/modules/toast/a;->f:I

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/facebook/react/modules/toast/a;->a:Lcom/facebook/react/modules/toast/ToastModule;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/facebook/react/modules/toast/a;->b:Ljava/lang/String;

    .line 4
    .line 5
    iget v2, p0, Lcom/facebook/react/modules/toast/a;->c:I

    .line 6
    .line 7
    iget v3, p0, Lcom/facebook/react/modules/toast/a;->d:I

    .line 8
    .line 9
    iget v4, p0, Lcom/facebook/react/modules/toast/a;->e:I

    .line 10
    .line 11
    iget v5, p0, Lcom/facebook/react/modules/toast/a;->f:I

    .line 12
    .line 13
    invoke-static/range {v0 .. v5}, Lcom/facebook/react/modules/toast/ToastModule;->c(Lcom/facebook/react/modules/toast/ToastModule;Ljava/lang/String;IIII)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
