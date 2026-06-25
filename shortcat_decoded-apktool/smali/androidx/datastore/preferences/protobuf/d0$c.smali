.class Landroidx/datastore/preferences/protobuf/d0$c;
.super Landroidx/datastore/preferences/protobuf/d0$f;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/datastore/preferences/protobuf/d0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation


# instance fields
.field final synthetic b:Landroidx/datastore/preferences/protobuf/d0;


# direct methods
.method private constructor <init>(Landroidx/datastore/preferences/protobuf/d0;)V
    .locals 1

    .line 1
    iput-object p1, p0, Landroidx/datastore/preferences/protobuf/d0$c;->b:Landroidx/datastore/preferences/protobuf/d0;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Landroidx/datastore/preferences/protobuf/d0$f;-><init>(Landroidx/datastore/preferences/protobuf/d0;Landroidx/datastore/preferences/protobuf/d0$a;)V

    return-void
.end method

.method synthetic constructor <init>(Landroidx/datastore/preferences/protobuf/d0;Landroidx/datastore/preferences/protobuf/d0$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Landroidx/datastore/preferences/protobuf/d0$c;-><init>(Landroidx/datastore/preferences/protobuf/d0;)V

    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 3

    .line 1
    new-instance v0, Landroidx/datastore/preferences/protobuf/d0$b;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/datastore/preferences/protobuf/d0$c;->b:Landroidx/datastore/preferences/protobuf/d0;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Landroidx/datastore/preferences/protobuf/d0$b;-><init>(Landroidx/datastore/preferences/protobuf/d0;Landroidx/datastore/preferences/protobuf/d0$a;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method
