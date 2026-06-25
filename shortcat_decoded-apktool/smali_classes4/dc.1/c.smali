.class public final synthetic Ldc/c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lexpo/modules/kotlin/jni/JNIAsyncFunctionBody;


# instance fields
.field public final synthetic a:Ljava/lang/ref/WeakReference;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ldc/e;

.field public final synthetic d:LUb/d;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/ref/WeakReference;Ljava/lang/String;Ldc/e;LUb/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldc/c;->a:Ljava/lang/ref/WeakReference;

    .line 5
    .line 6
    iput-object p2, p0, Ldc/c;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Ldc/c;->c:Ldc/e;

    .line 9
    .line 10
    iput-object p4, p0, Ldc/c;->d:LUb/d;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke([Ljava/lang/Object;Lexpo/modules/kotlin/jni/PromiseImpl;)V
    .locals 6

    .line 1
    iget-object v0, p0, Ldc/c;->a:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    iget-object v1, p0, Ldc/c;->b:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Ldc/c;->c:Ldc/e;

    .line 6
    .line 7
    iget-object v3, p0, Ldc/c;->d:LUb/d;

    .line 8
    .line 9
    move-object v4, p1

    .line 10
    move-object v5, p2

    .line 11
    invoke-static/range {v0 .. v5}, Ldc/e;->p(Ljava/lang/ref/WeakReference;Ljava/lang/String;Ldc/e;LUb/d;[Ljava/lang/Object;Lexpo/modules/kotlin/jni/PromiseImpl;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
