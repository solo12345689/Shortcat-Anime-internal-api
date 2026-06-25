.class public final synthetic Lz8/o;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lz8/M$b;


# instance fields
.field public final synthetic a:Lz8/M;

.field public final synthetic b:Lr8/o;


# direct methods
.method public synthetic constructor <init>(Lz8/M;Lr8/o;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lz8/o;->a:Lz8/M;

    .line 5
    .line 6
    iput-object p2, p0, Lz8/o;->b:Lr8/o;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lz8/o;->a:Lz8/M;

    .line 2
    .line 3
    iget-object v1, p0, Lz8/o;->b:Lr8/o;

    .line 4
    .line 5
    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    .line 6
    .line 7
    invoke-static {v0, v1, p1}, Lz8/M;->z(Lz8/M;Lr8/o;Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Boolean;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method
