.class public final synthetic Lcom/facebook/react/modules/toast/c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/facebook/react/modules/toast/ToastModule;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/react/modules/toast/ToastModule;Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/facebook/react/modules/toast/c;->a:Lcom/facebook/react/modules/toast/ToastModule;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/facebook/react/modules/toast/c;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput p3, p0, Lcom/facebook/react/modules/toast/c;->c:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/modules/toast/c;->a:Lcom/facebook/react/modules/toast/ToastModule;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/facebook/react/modules/toast/c;->b:Ljava/lang/String;

    .line 4
    .line 5
    iget v2, p0, Lcom/facebook/react/modules/toast/c;->c:I

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Lcom/facebook/react/modules/toast/ToastModule;->a(Lcom/facebook/react/modules/toast/ToastModule;Ljava/lang/String;I)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
