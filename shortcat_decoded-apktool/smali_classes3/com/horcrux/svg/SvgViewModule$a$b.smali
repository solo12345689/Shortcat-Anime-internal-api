.class Lcom/horcrux/svg/SvgViewModule$a$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/horcrux/svg/SvgViewModule$a;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/horcrux/svg/SvgViewModule$a;


# direct methods
.method constructor <init>(Lcom/horcrux/svg/SvgViewModule$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/horcrux/svg/SvgViewModule$a$b;->a:Lcom/horcrux/svg/SvgViewModule$a;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/horcrux/svg/SvgViewModule$a$b;->a:Lcom/horcrux/svg/SvgViewModule$a;

    .line 2
    .line 3
    iget v1, v0, Lcom/horcrux/svg/SvgViewModule$a;->a:I

    .line 4
    .line 5
    iget-object v2, v0, Lcom/horcrux/svg/SvgViewModule$a;->b:Lcom/facebook/react/bridge/ReadableMap;

    .line 6
    .line 7
    iget-object v3, v0, Lcom/horcrux/svg/SvgViewModule$a;->c:Lcom/facebook/react/bridge/Callback;

    .line 8
    .line 9
    iget v0, v0, Lcom/horcrux/svg/SvgViewModule$a;->d:I

    .line 10
    .line 11
    add-int/lit8 v0, v0, 0x1

    .line 12
    .line 13
    invoke-static {v1, v2, v3, v0}, Lcom/horcrux/svg/SvgViewModule;->a(ILcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Callback;I)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
