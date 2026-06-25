.class public final Lsa/b$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lsa/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Lsa/a;


# direct methods
.method constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lsa/b$a;->a:Lsa/a;

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public a()Lsa/b;
    .locals 2

    .line 1
    new-instance v0, Lsa/b;

    .line 2
    .line 3
    iget-object v1, p0, Lsa/b$a;->a:Lsa/a;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lsa/b;-><init>(Lsa/a;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public b(Lsa/a;)Lsa/b$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lsa/b$a;->a:Lsa/a;

    .line 2
    .line 3
    return-object p0
.end method
