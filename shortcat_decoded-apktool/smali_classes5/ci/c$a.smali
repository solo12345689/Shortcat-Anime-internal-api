.class Lci/c$a;
.super Ljava/lang/ThreadLocal;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lci/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lci/c;


# direct methods
.method constructor <init>(Lci/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lci/c$a;->a:Lci/c;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method protected a()Lci/c$c;
    .locals 1

    .line 1
    new-instance v0, Lci/c$c;

    .line 2
    .line 3
    invoke-direct {v0}, Lci/c$c;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method protected bridge synthetic initialValue()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lci/c$a;->a()Lci/c$c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
