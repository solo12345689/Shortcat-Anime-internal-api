.class public final synthetic LT3/e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroid/database/DatabaseErrorHandler;


# instance fields
.field public final synthetic a:LS3/h$a;

.field public final synthetic b:LT3/d$b;


# direct methods
.method public synthetic constructor <init>(LS3/h$a;LT3/d$b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LT3/e;->a:LS3/h$a;

    .line 5
    .line 6
    iput-object p2, p0, LT3/e;->b:LT3/d$b;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onCorruption(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 2

    .line 1
    iget-object v0, p0, LT3/e;->a:LS3/h$a;

    .line 2
    .line 3
    iget-object v1, p0, LT3/e;->b:LT3/d$b;

    .line 4
    .line 5
    invoke-static {v0, v1, p1}, LT3/d$c;->a(LS3/h$a;LT3/d$b;Landroid/database/sqlite/SQLiteDatabase;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
