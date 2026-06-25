.class public final Lcom/facebook/react/a$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Iterable;
.implements Lje/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/a;->getNativeModuleIterator$ReactAndroid_release(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/lang/Iterable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/Iterator;

.field final synthetic b:Lcom/facebook/react/a;

.field final synthetic c:Lcom/facebook/react/bridge/ReactApplicationContext;


# direct methods
.method public constructor <init>(Ljava/util/Iterator;Lcom/facebook/react/a;Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/a$b;->a:Ljava/util/Iterator;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/facebook/react/a$b;->b:Lcom/facebook/react/a;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/facebook/react/a$b;->c:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 4

    .line 1
    new-instance v0, Lcom/facebook/react/a$c;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/facebook/react/a$b;->a:Ljava/util/Iterator;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/facebook/react/a$b;->b:Lcom/facebook/react/a;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/facebook/react/a$b;->c:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 8
    .line 9
    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/react/a$c;-><init>(Ljava/util/Iterator;Lcom/facebook/react/a;Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method
