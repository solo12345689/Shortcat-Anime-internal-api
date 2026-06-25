.class public final synthetic Ldc/q;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lexpo/modules/kotlin/jni/JNIFunctionBody;


# instance fields
.field public final synthetic a:Ldc/r;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:LUb/d;


# direct methods
.method public synthetic constructor <init>(Ldc/r;Ljava/lang/String;LUb/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldc/q;->a:Ldc/r;

    .line 5
    .line 6
    iput-object p2, p0, Ldc/q;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Ldc/q;->c:LUb/d;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Ldc/q;->a:Ldc/r;

    .line 2
    .line 3
    iget-object v1, p0, Ldc/q;->b:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Ldc/q;->c:LUb/d;

    .line 6
    .line 7
    invoke-static {v0, v1, v2, p1}, Ldc/r;->m(Ldc/r;Ljava/lang/String;LUb/d;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method
